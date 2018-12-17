package project1.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import project1.beans.Employee;
import project1.dao.EmployeeDAO;
import project1.dao.EmployeeDAOEmpl;
import project1.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		//init();
		EmployeeDAO emp = new EmployeeDAOEmpl();
		//System.out.println(emp.getEmployeeById(12));
		//emp.addEmployee(1, "Max", "Jones", "Mjones3@gmail.com");
		//emp.updateEmployee(10, "Max", "Couch", "food@gmail.com");
		emp.removeEmployee(14);
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
