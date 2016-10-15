package org.appdirect.com.dao;

import java.util.List;

import org.appdirect.com.bean.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployees();

	public Employee getEmployee(int id);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int id);

}
