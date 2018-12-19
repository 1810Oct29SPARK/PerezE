package project1.beans;

public class Employee {

	public Employee(int employeeId, int employeeTypeId, String firstName, String lastName, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeTypeId = employeeTypeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	private int employeeId;
	private int employeeTypeId;
	private String firstName;
	private String lastName;
	private String email;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeTypeId() {
		return employeeTypeId;
	}

	public void setEmployeeTypeId(int employeeTypeId) {
		this.employeeTypeId = employeeTypeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeTypeId=" + employeeTypeId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + "]";
	}

}
