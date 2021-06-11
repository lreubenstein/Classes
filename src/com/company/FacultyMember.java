package com.company;

public class FacultyMember extends StaffMember {
	private double yearlySalary;

	public FacultyMember(String n, int year, double salary) {
		super(n, false, year);
		yearlySalary = salary;
	}

	@Override
	public double getWeeklySalary() {
		System.out.print("sub class faculty- ");
		double pay = yearlySalary/42.0;
		return pay;
	}

}
