package com.metacube;

public class Developer extends Employee {

	public Developer(String name, int id) {
		super(name, id);
	}

	//Returning basic salary for Developer
	@Override
	public double getBasicSalary() {
		return 50000;
	}

	//Returning bonus amount for Developer
	@Override
	public double getBonus() {
		return 2000;
	}

	//Returning compensation (basic salary + bonus) for Developer
	@Override
	public double getCompensation() {
		return getBasicSalary() + getBonus(); 
	}
	
}
