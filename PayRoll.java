package com.metacube;

public class PayRoll {
	/**
	 * Method to calculate tax depending upon salary amount
	 * @param employee
	 * @return double , tax amount needs to be deducted
	 */
	public double calculateTax(Employee employee) {
		double employeeSalary = employee.calculateSalary();
		double tax = 0.0;
		if(employeeSalary <= 50000) {
			tax = employeeSalary * 0.01;
		}else if(employeeSalary > 50000 && employeeSalary <= 70000) {
			tax = employeeSalary * 0.05;
		}else {
			tax = employeeSalary * 0.1;
		}
		return tax;
	}
	
	/**
	 * Method to print pay slip of an employee
	 * @param employee
	 */
	public void printPaySlip(Employee employee) {
		System.out.println("--------------------");
		System.out.println("Payslip for : " + employee.getEmployeeName());
		System.out.println("Employee ID : " + employee.getEmployeeId());
		System.out.println("Basic Salary : $" + employee.getBasicSalary());
		System.out.println("Bonus : $" + employee.getBonus());
		System.out.println("Compensation : $" + employee.getCompensation());
		System.out.println("Tax deducted : $" + calculateTax(employee));
		System.out.println("Salary after Tax deduction : $" + (employee.calculateSalary() - calculateTax(employee)));
		System.out.println("--------------------");
	}
	
	/**
	 * Method to print pay slip for all employees of organization
	 * @param organization
	 */
	public void printAllPaySlips(Organization organization) {
		for(Employee employee : organization.getAllEmployees()) {
			printPaySlip(employee);
			System.out.println("\n");
		}
	}
}
