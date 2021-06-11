package com.company;/*
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 * Author: Alex
 */

public class Fraction
{

  // ******************  Instance variables  ******************

  private int num;
  private int denom;
  public static int numFractions = 0;

  // *********************  Constructors  *********************

  public Fraction()       // no-args constructor - default
  {
    //num = 0;
    //denom = 1;
    this(0,1);

  }

  public Fraction(int n)
  {
    //num = n;
    //denom = 1;
	  this(n,1);
  }

  public Fraction(int n, int d)
  {
	numFractions ++;
    if (d != 0)
    {
      num = n;
      denom = d;
      reduce();
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }
  
  public static int getNumFractions() {

	  //System.out.println(num);
	  return numFractions;
  }

  public Fraction(Fraction other)  // copy constructor
  {
    //num = other.num;
    //denom = other.denom;
    this(other.num, other.denom);
  }

  // ********************  Public methods  ********************

  // Returns the sum of this fraction and other
  public Fraction add(Fraction other)
  {
    int newNum = this.num * other.denom + this.denom * other.num;
    int newDenom = this.denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the sum of this fraction and m
  /*
  public Fraction add(int m)
  {
    return new Fraction(num + m * denom, denom);
  }*/
  
  public Fraction add(int m)
  {
	  Fraction f = new Fraction (m);
	  return this.add(f);
  }

  // Returns the product of this fraction and other
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the product of this fraction and m
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom);
  }

  // Returns the value of this fraction as a double
  public double getValue()
  {
    return (double)num / (double)denom;
  }
  
  public int getNum() {
	  return num;
  }

  // Returns a string representation of this fraction
  public String toString()
  {
    return num + "/" + denom;
  }

  // *******************  Private methods  ********************

  // Reduces this fraction by the gcf and makes denom > 0
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;
  }

  //  Returns the greatest common factor of two positive integers
  public static int gcf(int n, int d)
  {
	  
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    if (n % d == 0)
      return d;
    else if (d % n == 0)
      return n;
    else
      return gcf(n % d, d % n);
  }
  
  public Fraction subtract(Fraction other)
  {
	  int newNum = num * other.denom - denom * other.num;
	  int newDenom = denom * other.denom;
	  return new Fraction(newNum, newDenom);
  }
  
  public Fraction divide(Fraction other)
  {
	  if (other.num == 0)
	  {
		  throw new IllegalArgumentException(
		           "Fraction construction error: dividing by 0");
	  }
	  int newNum = num * other.denom;
	  int newDenom = denom * other.num;
	  return new Fraction(newNum, newDenom);
  }
  
  public static void main (String [] args)
  {
	  Fraction f1 = new Fraction(3,4);
	  Fraction f2 = new Fraction(2,3);
	  
	  Fraction f3 = f1.add(f2);
	  System.out.println(f3);
	  System.out.println(f2.add(f1));
	  System.out.println("Number of fractions is " + numFractions);
	  System.out.println("greatest common factor 24, 16 "+ gcf(24,16));
	  //System.out.println(f1.num);
  }
}
