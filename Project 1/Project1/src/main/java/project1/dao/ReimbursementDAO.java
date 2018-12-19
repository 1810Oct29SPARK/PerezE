package project1.dao;

import java.util.List;

import project1.beans.Reimbursement;

public interface ReimbursementDAO {
	//define necessary CRUD methods and build an implementing class in this package
	public Reimbursement getReimbursementById(int employeeId);
	public void addReimbursement(int employeeId, String category, Double amount, String status, String approvedBy, String dateSubmitted);
	public void updateReimbursement(int reimbursementId, String status, String approvedBy);
	List<Reimbursement> getReimbursement();
}
