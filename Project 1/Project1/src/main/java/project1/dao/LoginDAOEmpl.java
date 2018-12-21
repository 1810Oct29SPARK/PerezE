package project1.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import project1.beans.Employee;
import project1.beans.Login;
import project1.util.ConnectionUtil;

public class LoginDAOEmpl implements LoginDAO {
	
	private static final String filename = "connection.properties";

	@Override
	public Login getLoginInfoByUsername(String username) {
		Login b = null;
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "SELECT * FROM LOGIN WHERE USERNAME = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery(); //table of the results
			while(rs.next()) {
				int loginId = rs.getInt("LOGIN_ID");
				int empId = rs.getInt("EMPLOYEE_ID");
				String name = rs.getString("USERNAME");
				String empPass = rs.getString("EMPLOYEE_PASSWORD");
				b = new Login(loginId, empId, name, empPass);
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
	public void addLoginIfno(int employeeId, String username, String employeePassword) {
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "INSERT INTO LOGIN(EMPLOYEE_ID, USERNAME, EMPLOYEE_PASSWORD) VALUES(?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			pstmt.setString(2, username);
			pstmt.setString(3, employeePassword);
			pstmt.executeQuery(); //table of the results
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
