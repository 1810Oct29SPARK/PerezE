package project1.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project1.beans.Employee;
import project1.util.ConnectionUtil;

public class EmployeeDAOEmpl implements EmployeeDAO {
	
	private static final String filename = "connection.properties";

	@Override
	public Employee getEmployeeByUsername(String username) {
		Employee b = null;
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "SELECT * " + 
					"FROM EMPLOYEE E " + 
					"FULL JOIN LOGIN ON E.EMPLOYEE_ID = LOGIN.EMPLOYEE_ID " + 
					"WHERE USERNAME = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery(); //table of the results
			while(rs.next()) {
				int empId = rs.getInt("EMPLOYEE_ID");
				int employeeTypeId = rs.getInt("EMPLOYEE_TYPE_ID");
				String firstName = rs.getString("FIRSTNAME");
				String lastName = rs.getString("LASTNAME");
				String email = rs.getString("EMAIL");
				b = new Employee(empId, employeeTypeId, firstName, lastName, email);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public void addEmployee(int employeeTypeId, String firstName, String lastName, String email) {
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "INSERT INTO EMPLOYEE(EMPLOYEE_TYPE_ID, FIRSTNAME, LASTNAME, EMAIL) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeTypeId);
			pstmt.setString(2, firstName);
			pstmt.setString(3, lastName);
			pstmt.setString(4, email);
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(int empNum, String newFirst, String newLast, String newEmail) {
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "UPDATE EMPLOYEE " + 
					"SET FIRSTNAME = ?, LASTNAME = ?, EMAIL = ? " + 
					"WHERE EMPLOYEE_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, newFirst);
			pstmt.setString(2, newLast);
			pstmt.setString(3, newEmail);
			pstmt.setInt(4, empNum);
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeEmployee(int employeeId) {
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "DELETE FROM EMPLOYEE WHERE EMPLOYEE_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Employee> getEmployees() {
		List<Employee> emps = new ArrayList<>();
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Bear, Cave, and BearType into a ResultSet
			//map the ResultSet's entries onto a list of Bear objects
			String sql = "SELECT * " + 
					"FROM EMPLOYEE ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int employeeId = rs.getInt("EMPLOYEE_ID");
				int employeeTypeId = rs.getInt("EMPLOYEE_TYPE_ID");
				String firstName = rs.getString("FIRSTNAME");
				String lastName = rs.getString("LASTNAME");
				String email = rs.getString("EMAIL");
				emps.add(new Employee(employeeId, employeeTypeId, firstName, lastName, email));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emps;
	}
}
