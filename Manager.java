package com.metacube;

public class Manager extends Employee {

	public Manager(String name, int id) {
		super(name, id);
	}

	//Returning basic salary for Manager
	@Override
	public double getBasicSalary() {
		return 70000;
	}

	//Returning bonus amount for Manager
	@Override
	public double getBonus() {
		return 5000;
	}

	//Returning compensation (basic salary + bonus) for Manager
	@Override
	public double getCompensation() {
		return getBasicSalary()+getBonus();
	}

}
