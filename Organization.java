package com.metacube;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	private String organizationName;
	private List<Department> departments;
	
	/**
	 * Organization constructor
	 * @param name
	 */
	public Organization(String name) {
		this.organizationName = name;
		this.departments = new ArrayList<>();
	}
	
	/**
	 * Method to add a department in an organizatiob 
	 * @param department 
	 * @return
	 */
	public boolean addDepartment(Department department) {
		if(departments.contains(department)) {
			throw new IllegalArgumentException("Department Already Present!");
		}
		
		departments.add(department);
		return true;
	}
	
	/**
	 * To get all employee list of organization
	 * @return
	 */
	public List<Employee> getAllEmployees(){
		List<Employee> allEmployees = new ArrayList<>();
		
		for(Department department : departments) {
			allEmployees.addAll(department.getEmployees());
		}
		
		return allEmployees;
	}
}
