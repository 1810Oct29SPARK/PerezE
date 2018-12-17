package project1.beans;

public class Reimbursement {
	
	public Reimbursement(int reimbursementId, int employeeId, String reimCategory, Double amount, String status,
			String approvedBy, String dateApproved) {
		super();
		this.reimbursementId = reimbursementId;
		this.employeeId = employeeId;
		this.reimCategory = reimCategory;
		this.amount = amount;
		this.status = status;
		this.approvedBy = approvedBy;
		this.dateApproved = dateApproved;
	}
	private int reimbursementId;
	private int employeeId;
	private String reimCategory;
	private Double amount;
	private String status;
	private String approvedBy;
	private String dateApproved;
	public int getReimbursementId() {
		return reimbursementId;
	}
	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getReimCategory() {
		return reimCategory;
	}
	public void setReimCategory(String reimCategory) {
		this.reimCategory = reimCategory;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getDateApproved() {
		return dateApproved;
	}
	public void setDateApproved(String dateApproved) {
		this.dateApproved = dateApproved;
	}
	@Override
	public String toString() {
		return "Reimbursement [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId + ", reimCategory="
				+ reimCategory + ", amount=" + amount + ", status=" + status + ", approvedBy=" + approvedBy
				+ ", dateApproved=" + dateApproved + "]";
	}

}
