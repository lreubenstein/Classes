package com.company;

public class Mess {	private double radius;
public Mess(double r) {		radius=r;	}	public double area()
{double a= Math.PI*radius*radius;		return a;
	}

						public double circ()	{
double c = 2*Math.PI*radius;
		return c;}


public static void main(String[] args) { Mess m = new Mess(3.0); System.out.println(m.area());
System.out.println(m.circ());
}
}
