package com.metacube;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String departmentName;
	private List<Employee> employees;
	
	//Constructor for department , which takes name as input and create empty list of employees
	public Department(String name) {
		this.departmentName = name;
		this.employees = new ArrayList<>();
	}
	
	/**
	 * Getter for Department Name
	 * @return String , department name
	 */
	public String getName() {
		return departmentName;
	}
	
	/**
	 * Method to make an employee join a department
	 * @param employee
	 * @return  boolean , false if employee already in that department , true for successful joining
	 */
	public boolean join(Employee employee) {
		if(employees.contains(employee)) {
			return false;
		}
		
		employees.add(employee);
		return true;
	}
	
	/**
	 * Method to make an employee relieve a department
	 * @param employee
	 * @return boolean , false if employee not in that department , true for successful relieving
	 */
	public boolean relieve(Employee employee) {
		if(employees.contains(employee)) {
			employees.remove(employee);
			return true;
		}
		
		return false;
	}
	
	/**
	 * Method to get all employees of particular department 
	 * @return List<Employee>
	 */
	public List<Employee> getEmployees(){
		return employees;
	}
	
}
