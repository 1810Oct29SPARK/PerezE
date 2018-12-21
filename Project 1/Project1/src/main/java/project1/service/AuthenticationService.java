package project1.service;

import project1.beans.Employee;
import project1.beans.Login;
import project1.dao.EmployeeDAO;
import project1.dao.EmployeeDAOEmpl;
import project1.dao.LoginDAO;
import project1.dao.LoginDAOEmpl;
import project1.model.Credentials;

public class AuthenticationService {

	LoginDAO log = new LoginDAOEmpl();
	EmployeeDAO emp = new EmployeeDAOEmpl();

	public AuthenticationService() {
	}
	
	public Employee isValidUser(Credentials credentials) {
		Employee u = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		Login val = log.getLoginInfoByUsername(username);
		//this is AUTHENTICATION (does the user exist in the system?)
		//now AUTHORIZATION (what can the user access within the system?) (user roles)
		//take credentials and return the User to which they belong if it exists
		if (username != null && password != null) {
			//for now... this is fake!! 
			if (username.equals(val.getUsername()) && password.equals(val.getEmpPass())) {
				Employee e = emp.getEmployeeByUsername(username);
				u = new Employee(e.getEmployeeId(), e.getEmployeeTypeId(), e.getFirstName(), e.getLastName(), e.getEmail());
			}
		}
		return u;
	}
	

}