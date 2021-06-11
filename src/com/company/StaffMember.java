package com.company;

public abstract class StaffMember {

	private String name;
	private boolean yearRound;
	private int startYear;
	
	public StaffMember(String n, boolean fy, int year)
	{
		name = n;
		this.yearRound = fy;
		startYear = year;
	}
	public String getName()
	{
		return name;
	}
	
	public int yearOfService(int currYear)
	{
		System.out.print("base class - ");
		return currYear - startYear;
	}
	
	public abstract double getWeeklySalary();
}
