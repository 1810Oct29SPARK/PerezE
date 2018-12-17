package project1.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import project1.beans.Employee;
import project1.beans.Reimbursement;
import project1.util.ConnectionUtil;

public class ReimbursementDAOEmpl implements ReimbursementDAO{
	
	private static final String filename = "connection.properties";

	@Override
	public void getReimbursementById(int employeeId) {
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "SELECT * FROM REIMBURSEMENT WHERE EMPLOYEE_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			ResultSet rs = pstmt.executeQuery(); //table of the results
			while(rs.next()) {
				int empId = rs.getInt("EMPLOYEE_ID");
				int employeeTypeId = rs.getInt("EMPLOYEE_TYPE_ID");
				String firstName = rs.getString("FIRSTNAME");
				String lastName = rs.getString("LASTNAME");
				String email = rs.getString("EMAIL");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addReimbursement(int employeeId, String category, Double amount, String status, String approvedBy,
			String dateSubmitted) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReimbursement(int reimbursementId, String status, String appprovedBy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reimbursement> getReimbursement() {
		// TODO Auto-generated method stub
		return null;
	}

}
