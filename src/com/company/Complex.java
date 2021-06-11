package com.company;

public class Complex {
	private double real;
	private double imag;
	
	public Complex(double a)
	{
		real = a;
		imag = 0.0;
	}
	public Complex(double a, double b)
	{
		real = a;
		imag = b;
	}
	
	public double abs()
	{
		return(Math.sqrt(real*real + imag*imag));
	}
	
	public Complex add(Complex other)
	{
		double r = real + other.real;
		double i = imag + other.imag;
		return(new Complex(r,i));
	}
	public Complex add(double other)
	{
		double r = real + other;
		return(new Complex(r,imag));
	}
	
	public Complex multiply(Complex other)
	{
		double r = real*other.real;
		r -= imag * other.imag;
		double i = imag * other.real + real * other.imag;
		return (new Complex(r,i));
	}
	public Complex multiply(double other)
	{
		double r = real*other;
		double i = imag * other;
		return (new Complex(r,i));
	}
	public String toString()
	{
		return real + " + " + imag + "i";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(6.0);
		Complex c2 = new Complex(7.0, 4.0);
		Complex c3 = new Complex(8.0, 3.0);
		Complex c8 = new Complex(0.0, -3.5);
		System.out.println(c1 + "\n" + c2 + "\n" + c3);
		System.out.println(c2.abs());
		Complex c4 = c3.add(c2);
		Complex c5 = c2.multiply(c3);
		System.out.println(c4 + "\n" + c5);
		Complex c6 = c3.add(3.5);
		Complex c7 = c2.multiply(2.5);
		System.out.println(c6 + "\n" + c7);
		Complex c9 = c3.add(c8);
		Complex c10 = c3.multiply(c8);
		System.out.println(c9 + "\n" +  c10);
	}

}
