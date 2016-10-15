package org.appdirect.com.bean;

public class Employee {

	int id;
	String employeeName;
	int salary;

	public Employee() {
		super();
	}

	public Employee(int i, String employeeName, int salary) {
		super();
		this.id = i;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
