package com.company;

public class ClericalStaff extends StaffMember {

	public double hourlyRate;
	
	public ClericalStaff(String n, int year, double rate) {
		
		super(n, true, year);
		// TODO Auto-generated constructor stub
		hourlyRate = rate;
	}

	@Override
	public double getWeeklySalary() {
		System.out.print("sub class clerical - ");
		return hourlyRate*40.0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
