package com.company;

public class StaffTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaffMember [] sm = new StaffMember[3];
		
		sm[0] = new FacultyMember("Flanagan", 2002, 45000);
		sm[1] = new ClericalStaff("Endicott", 1985, 12.0);
		sm[2] = new FacultyMember("Reubenstein", 2007, 41000);
		
		for(StaffMember s:sm)
		{
			System.out.println(s.getName());
			System.out.println(s.yearOfService(2020));
			System.out.println(s.getWeeklySalary());
		}

	}

}
