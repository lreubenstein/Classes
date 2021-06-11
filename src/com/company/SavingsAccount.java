package com.company;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount(int idNumber, double startBal, double rate) {
		super(idNumber, startBal);
		// TODO Auto-generated constructor stub
		interestRate = rate;
	}

	public void withdraw(double amount)
	{
		if (amount <= currentBalance())
		{
			decreaseBalance(amount);
		}
	}
	@Override
	public double monthlyInterest() {
		// TODO Auto-generated method stub
		return currentBalance() * interestRate / 12.0;
	}

}
