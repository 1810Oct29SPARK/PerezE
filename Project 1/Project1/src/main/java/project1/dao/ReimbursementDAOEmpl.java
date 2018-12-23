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
import project1.beans.Reimbursement;
import project1.util.ConnectionUtil;

public class ReimbursementDAOEmpl implements ReimbursementDAO{
	
	private static final String filename = "connection.properties";

//	@Override
//	public Reimbursement getReimbursementById(int employeeId) {
//		Reimbursement r = null;
//		//try-with-resources.. con will be close at the end of the block
//		try(Connection con = ConnectionUtil.getConnection(filename)) {
//			//write a join which unifies Employee, and EmployeeType into a ResultSet
//			//map the ResultSet's entries onto a Employee
//			String sql = "SELECT * FROM REIMBURSEMENT WHERE EMPLOYEE_ID = ?";
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, employeeId);
//			ResultSet rs = pstmt.executeQuery(); //table of the results
//			while(rs.next()) {
//				int remId = rs.getInt("REIMBURSEMENT_ID");
//				int empId = rs.getInt("EMPLOYEE_ID");
//				String riemCat = rs.getString("REIMBURSEMENT_CATEGORY");
//				Double amount = rs.getDouble("AMOUNT");
//				String status = rs.getString("STATUS");
//				String submittedBy = rs.getString("APPROVED_BY");
//				String dateSubmitted = rs.getString("DATE_SUBMITTED");
//				r = new Reimbursement(remId, empId, riemCat, amount, status, submittedBy, dateSubmitted);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return r;
//	}

	@Override
	public void addReimbursement(int employeeId, String category, Double amount, String status, String approvedBy,
			String dateSubmitted) {
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "INSERT INTO REIMBURSEMENT(EMPLOYEE_ID, REIMBURSEMENT_CATEGORY, AMOUNT, STATUS, APPROVED_BY, DATE_SUBMITTED) "
					+"VALUES(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			pstmt.setString(2, category);
			pstmt.setDouble(3, amount);
			pstmt.setString(4, status);
			pstmt.setString(5, approvedBy);
			pstmt.setString(6, dateSubmitted);
			pstmt.executeQuery(); //table of the results
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateReimbursement(int reimbursementId, String status, String approvedBy) {
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Employee, and EmployeeType into a ResultSet
			//map the ResultSet's entries onto a Employee
			String sql = "UPDATE REIMBURSEMENT_ID " + 
					"SET STATUS = ?, APPROVED_BY = ? " + 
					"WHERE REIMBURSEMENT_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, reimbursementId);
			pstmt.setString(1, status);
			pstmt.setString(2, approvedBy);
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
	public List<Reimbursement> getReimbursement() {
		List<Reimbursement> reim = new ArrayList<>();
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Bear, Cave, and BearType into a ResultSet
			//map the ResultSet's entries onto a list of Bear objects
			String sql = "SELECT * " + 
					"FROM REIMBURSEMENT ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int remId = rs.getInt("REIMBURSEMENT_ID");
				int empId = rs.getInt("EMPLOYEE_ID");
				String riemCat = rs.getString("REIMBURSEMENT_CATEGORY");
				Double amount = rs.getDouble("AMOUNT");
				String status = rs.getString("STATUS");
				String submittedBy = rs.getString("APPROVED_BY");
				String dateSubmitted = rs.getString("DATE_SUBMITTED");
				reim.add(new Reimbursement(remId, empId, riemCat, amount, status, submittedBy, dateSubmitted));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reim;
	}
	
	@Override
	public List<Reimbursement> listReimbursements(int employeeId) {
		List<Reimbursement> reimL = new ArrayList<>();
		//try-with-resources.. con will be close at the end of the block
		try(Connection con = ConnectionUtil.getConnection(filename)) {
			//write a join which unifies Bear, Cave, and BearType into a ResultSet
			//map the ResultSet's entries onto a list of Bear objects
			String sql = "SELECT * FROM REIMBURSEMENT WHERE EMPLOYEE_ID = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, employeeId);
			ResultSet rs = pstmt.executeQuery(); //table of the results
			while(rs.next()) {
				int remId = rs.getInt("REIMBURSEMENT_ID");
				int empId = rs.getInt("EMPLOYEE_ID");
				String riemCat = rs.getString("REIMBURSEMENT_CATEGORY");
				Double amount = rs.getDouble("AMOUNT");
				String status = rs.getString("STATUS");
				String submittedBy = rs.getString("APPROVED_BY");
				String dateSubmitted = rs.getString("DATE_SUBMITTED");
				reimL.add(new Reimbursement(remId, empId, riemCat, amount, status, submittedBy, dateSubmitted));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reimL;
	}

}
