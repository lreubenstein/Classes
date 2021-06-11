package com.company; /**
 * 
 */

/**
 * @author lreubenstein
 *
 */
public class SpecialCheckingAccount extends CheckingAccount {

	private double interestRate;
	private double minBalance;
	/**
	 * @param idNumber
	 * @param startBal
	 * @param cc
	 */
	public SpecialCheckingAccount(int idNumber, double startBal, double cc, 
			double interest, double minbal) {
		super(idNumber, startBal, cc);
		// TODO Auto-generated constructor stub
		interestRate = interest;
		minBalance = minbal;
	}
	public void clearCheck(double amount)
	{
		if(currentBalance() >= minBalance)
			decreaseBalance(amount);
		
		else
			super.clearCheck(amount);
		
	}
	public double monthlyInterest()
	{
		if(currentBalance() >= minBalance)
			return currentBalance() * interestRate / 12.0;
		else
			return super.monthlyInterest();
	}

}
