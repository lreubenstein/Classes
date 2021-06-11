package com.company;

public abstract class ATriangle {
	private double side;
	
	public ATriangle(double s)
	{
		side = s;
	}
	
	public double getSide(){
		return side;
	}
	public abstract double getPerimeter();
	
	public abstract double getArea();
	
	public double getRatio()
	  {
	    return getArea()/getPerimeter();
	  }

}
