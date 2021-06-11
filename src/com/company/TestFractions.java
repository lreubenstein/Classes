package com.company;/*
 * This is a test class for the Fraction class
 *
 * Author: Blair
 */

public class TestFractions
{
  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
    //System.out.println(f1.num);
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    Fraction sum2 = f2.add(f1);
    System.out.println(f1 + " + " + f2 + " = " + sum);
    System.out.println(f2 + " + " + f1 + " = " + sum2);
    Fraction sum3 = f1.add(5);
    System.out.println(f1 + " + " + 5 + " = " + sum3);

    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2 + " = " + product);

    Fraction diff = f1.subtract(f2);
    System.out.println(f1 + " - " + f2 + " = " + diff);

    Fraction quot = f1.divide(f2);
    System.out.println(f1 + " / " + f2 + " = " + quot);

    System.out.println();
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args)
  {
    testConstructors();
    testArithmetic();
    testValues();

    int g = Fraction.gcf(24, 32);
    System.out.println("GCF of 24 and 32 = " + g);

    System.out.println(Fraction.numFractions);
    		
  }
}
