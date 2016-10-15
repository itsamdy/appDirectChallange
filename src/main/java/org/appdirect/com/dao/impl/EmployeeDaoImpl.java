package org.appdirect.com.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.appdirect.com.bean.Employee;
import org.appdirect.com.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

@Repository("emloyeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	private static HashMap<Integer, Employee> employeeMap = getEmployeeMap();

	public EmployeeDaoImpl() {
		super();

		initializeEmployeeData();

	}

	private static HashMap<Integer, Employee> getEmployeeMap() {
		return employeeMap;
	}

	private void initializeEmployeeData() {

		if (employeeMap == null) {
			employeeMap = new HashMap<Integer, Employee>();
			Employee firstEmployee = new Employee(1, "Joy", 10000);
			Employee secondEmployee = new Employee(2, "Sam", 24000);
			Employee thirdEmployee = new Employee(3, "Sandy", 80500);
			Employee fourthEmployee = new Employee(4, "Randy", 701000);

			employeeMap.put(1, firstEmployee);
			employeeMap.put(2, secondEmployee);
			employeeMap.put(3, thirdEmployee);
			employeeMap.put(4, fourthEmployee);
		}

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>(employeeMap.values());
		return employees;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee employee = employeeMap.get(id);
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		employee.setId(employeeMap.size() + 1);
		employeeMap.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		if (employee.getId() <= 0)
			return null;
		employeeMap.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		employeeMap.remove(id);

	}

}
