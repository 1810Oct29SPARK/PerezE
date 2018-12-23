package project1.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import project1.beans.Employee;
import project1.beans.Login;
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
		//System.out.println(emp.getEmployeeByUsername("John"));
		//Login val = log.getLoginInfoByUsername("John");
		//System.out.println(reim.listReimbursements(2));
		//System.out.println(val.getUsername());
		//emp.addEmployee(1, "Max", "Jones", "Mjones3@gmail.com");
		//emp.updateEmployee(10, "Max", "Couch", "food@gmail.com");
		//emp.removeEmployee(14);
		//System.out.println(log.getLoginInfoById(3));
		//System.out.println(reim.getReimbursementById(6));
		//reim.updateReimbursement(7, "approved", "Mary");
//		List<Reimbursement> reimbursement = reim.getReimbursement();
//		for (Reimbursement r : reimbursement) {
//			System.out.println(r);
//		}
		
//		List<Employee> employees = emp.getEmployees();
//		List<Employee> list = new ArrayList<>();
//		int i = 0;
//		for (Employee e : employees) {
//			//System.out.println(e);
//			list.add(e);
//		}
//		System.out.println(list.get(5));
//		System.out.println(list.size());

//	    Date dt = new Date();
//	    String strDateFormat = "dd-MM-YY";
//	    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
//	    String formattedDate= dateFormat.format(dt);
//	    System.out.println(formattedDate);
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
