package project1.dao;

import project1.beans.Login;

public interface LoginDAO {
	//define necessary CRUD methods and build an implementing class in this package
	public Login getLoginInfoByUsername(String username);
	public void addLoginIfno(int employeeId, String username, String employeePassword);
}
