package project1.dao;

import java.util.List;

import project1.beans.Employee;

public interface EmployeeDAO {
	//define necessary CRUD methods and build an implementing class in this package
	public Employee getEmployeeById(int employeeId);
	public void addEmployee(int employeeTypeId, String firstName, String lastName, String email);
	public void updateEmployee(int empNum, String newFirst, String newLast, String newEmail);
	public void removeEmployee(int employeeId);
	List<Employee> getEmployees();
}

 