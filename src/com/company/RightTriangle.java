package com.company;

public class RightTriangle extends ATriangle {

	public RightTriangle(double s)
	{
		super(s);
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double side = getSide();
		return (2 + Math.sqrt(2.0)) * side;
	}

	@Override
	public double getArea() {
		double side = getSide();
		
		return  side * side /2.0;
	}
	
	public String toString()
	{
		String s = "A right triangle with legs length " + getSide();
		return s;
	}

}
