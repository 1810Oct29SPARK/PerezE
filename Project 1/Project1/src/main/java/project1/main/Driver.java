package project1.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import project1.beans.Reimbursement;
import project1.dao.EmployeeDAO;
import project1.dao.EmployeeDAOEmpl;
import project1.dao.LoginDAO;
import project1.dao.LoginDAOEmpl;
import project1.dao.ReimbursementDAO;
import project1.dao.ReimbursementDAOEmpl;
import project1.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		//init();
		EmployeeDAO emp = new EmployeeDAOEmpl();
		LoginDAO log = new LoginDAOEmpl();
		ReimbursementDAO reim = new ReimbursementDAOEmpl();
		//System.out.println(emp.getEmployeeById(12));
		//emp.addEmployee(1, "Max", "Jones", "Mjones3@gmail.com");
		//emp.updateEmployee(10, "Max", "Couch", "food@gmail.com");
		//emp.removeEmployee(14);
		//System.out.println(log.getLoginInfoById(3));
		//System.out.println(reim.getReimbursementById(6));
//		List<Reimbursement> reimbursement = reim.getReimbursement();
//		for (Reimbursement r : reimbursement) {
//			System.out.println(r);
//		}
//		List<Employee> employees = emp.getEmployees();
//		for (Employee e : employees) {
//			System.out.println(e);
//		}
	}
	
	static void init() {
		try {
			Connection con = ConnectionUtil.getConnection("connection.properties");
			System.out.println(con);
		} catch(SQLException e)
		{
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
