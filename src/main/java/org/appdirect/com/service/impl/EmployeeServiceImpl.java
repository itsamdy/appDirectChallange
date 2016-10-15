package org.appdirect.com.service.impl;

import java.util.List;

import org.appdirect.com.bean.Employee;
import org.appdirect.com.dao.EmployeeDao;
import org.appdirect.com.dao.impl.EmployeeDaoImpl;
import org.appdirect.com.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao emloyeeDao = new EmployeeDaoImpl();

	public EmployeeServiceImpl() {
		super();

	}

	@Override
	public List<Employee> getAllEmployees() {
		return emloyeeDao.getAllEmployees();
	}

	public Employee getEmployee(int id) {
		return emloyeeDao.getEmployee(id);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return emloyeeDao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return emloyeeDao.updateEmployee(employee);

	}

	@Override
	public void deleteEmployee(int id) {
		emloyeeDao.deleteEmployee(id);
	}

}
