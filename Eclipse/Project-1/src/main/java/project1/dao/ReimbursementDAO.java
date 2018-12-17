package project1.dao;

public interface ReimbursementDAO {
	//define necessary CRUD methods and build an implementing class in this package
	public void reimbursement(int employeeId, String category, Double amount, String status, String approvedBy, String dateSubmited);
}
