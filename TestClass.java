package com.metacube;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestClass {
	@Test
	public void testOrganisation() {
		//Creating organization 
		Organization organization = new Organization("Metacube");
		
		//Creating devlopement and human resources department
		Department developmentDepartment = new Department("Development");
		Department humanResourcesDepartment = new Department("Human Resources");
		
		//Creating new developer employees
		Developer dev1 = new Developer("Divyanshu Vijay", 101);
		Developer dev2 = new Developer("Shyam Singh", 102);
		
		//Creating new hr Manager Employee
		Manager hrManager = new Manager("Chirag Singhal", 201);
		
		//Making both developers join development department
		developmentDepartment.join(dev1);
		developmentDepartment.join(dev2);
		
		//Making hr Manager join hr department
		humanResourcesDepartment.join(hrManager);
		
		//adding department to the organization
		organization.addDepartment(humanResourcesDepartment);
		organization.addDepartment(developmentDepartment);
		
		PayRoll payRoll = new PayRoll();
		assertEquals(3, organization.getAllEmployees().size());
		
		//printing pay slips for all employees of organization
		payRoll.printAllPaySlips(organization);
	}
}
