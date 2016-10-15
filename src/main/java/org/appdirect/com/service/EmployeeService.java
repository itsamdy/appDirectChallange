package org.appdirect.com.service;

import java.util.List;

import org.appdirect.com.bean.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public Employee getEmployee(int id);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int id);

}
