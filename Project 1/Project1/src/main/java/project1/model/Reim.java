package project1.model;


public class Reim {

	public Reim(int remId, int empId, String riemCat, Double amount, String status, String submittedBy) {
		super();
		this.remId = remId;
		this.empId = empId;
		this.riemCat = riemCat;
		this.amount = amount;
		this.status = status;
		this.submittedBy = submittedBy;
	}
	private int remId;
	private int empId;
	private String riemCat;
	private Double amount;
	private String status;
	private String submittedBy;
	public int getRemId() {
		return remId;
	}
	public void setRemId(int remId) {
		this.remId = remId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getRiemCat() {
		return riemCat;
	}
	public void setRiemCat(String riemCat) {
		this.riemCat = riemCat;
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
	public String getSubmittedBy() {
		return submittedBy;
	}
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	@Override
	public String toString() {
		return "Reim [remId=" + remId + ", empId=" + empId + ", riemCat=" + riemCat + ", amount=" + amount + ", status="
				+ status + ", submittedBy=" + submittedBy + "]";
	}

}
