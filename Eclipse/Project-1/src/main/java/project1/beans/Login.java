package project1.beans;

public class Login {
	
	public Login(int loginId, int employeeId, String username, String empPass) {
		super();
		this.loginId = loginId;
		this.employeeId = employeeId;
		this.username = username;
		this.empPass = empPass;
	}
	private int loginId;
	private int employeeId;
	private String username;
	private String empPass;
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", employeeId=" + employeeId + ", username=" + username + ", empPass="
				+ empPass + "]";
	}

}
