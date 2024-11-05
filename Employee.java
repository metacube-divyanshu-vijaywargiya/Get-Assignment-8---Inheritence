package com.metacube;

/**
 * Abstract Employee class 
 */
public abstract class Employee {

	private String employeeName;
	private int employeeId;
	
	/**
	 * Employee constructor
	 * @param name , employee name 
	 * @param id , employee id 
	 */
	public Employee( String name , int id ) {
		this.employeeName = name;
		this.employeeId = id;
	}
	
	/**
	 * Getter for employee name 
	 * @return
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	
	/**
	 * Getter for employee id
	 * @return
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	
	
	public abstract double getBasicSalary();
	public abstract double getBonus();
	public abstract double getCompensation();
	
	/**
	 * Method to calculate salary , On this we will deduct tax
	 * @return
	 */
	public double calculateSalary() {
		return getCompensation();
	}
	
}
