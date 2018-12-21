package project1.service;

import project1.beans.Login;
import project1.dao.LoginDAO;
import project1.dao.LoginDAOEmpl;
import project1.model.Credentials;
import project1.model.User;

public class AuthenticationService {

	LoginDAO log = new LoginDAOEmpl();

	public AuthenticationService() {
	}
	
	public User isValidUser(Credentials credentials) {
		User u = null;
		String username = credentials.getUsername();
		String password = credentials.getPassword();
		Login val = log.getLoginInfoByUsername(username);
		//this is AUTHENTICATION (does the user exist in the system?)
		//now AUTHORIZATION (what can the user access within the system?) (user roles)
		//take credentials and return the User to which they belong if it exists
		if (username != null && password != null) {
			//for now... this is fake!! 
			System.out.println("in first if");
			if (username.equals(val.getUsername()) && password.equals(val.getEmpPass())) {
				System.out.println("in second if");
				u = new User(5,username,"Merlin","Cat","wizcat@tampa.com");
			}
		}
		System.out.println(u);
		return u;
	}
	

}