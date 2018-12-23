package project1.model;


public class Reim {

	public Reim(int empId, String riemCat, Double amount) {
		super();
		this.empId = empId;
		this.riemCat = riemCat;
		this.amount = amount;
	}
	private int empId;
	private String riemCat;
	private Double amount;
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
	@Override
	public String toString() {
		return "Reim [empId=" + empId + ", riemCat=" + riemCat + ", amount=" + amount + "]";
	}

}
