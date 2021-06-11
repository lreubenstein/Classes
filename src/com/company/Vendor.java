package com.company;

/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
  private int price;
  private int numstock;
  private int depositedAmount;
  private int change;

  private static double totalSales = 0;

  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor(int p, int stock)
  {
    price = p;
    numstock = stock;
    depositedAmount = 0;
    change = 0;
  }

  public static double getTotalSales()
  {
	  double tot = totalSales;
	  totalSales = 0;
	  return tot;
  }
  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty)
  {
    numstock = qty;
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock()
  {
    return numstock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney( int cents)
  {
	  if (numstock >0)
		  depositedAmount += cents;
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit()
  {
    return depositedAmount;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  boolean makeSale()
  {
    if(depositedAmount >= price)
    {
    	numstock--;
    	change = depositedAmount - price;
    	depositedAmount =0;
    	totalSales += price/100.0;
    	return true;
    }
    else
    {
    	change = depositedAmount;
    	depositedAmount = 0;
    	return false;
    }
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  int getChange ()
  {
    int ch = change;
    change = 0;
    return ch;
  }
}
