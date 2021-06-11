package com.company;

public class EquiTriangle extends ATriangle {

	public EquiTriangle(double s)
	{
		super(s);
	}
	@Override
	public double getPerimeter() {
		double side = getSide();
		return side * 3.0;
	}

	@Override
	public double getArea() {
		double side = getSide();
		return Math.sqrt(3) / 4 * side * side;
	}
	public String toString()
	{
		String s = "An equilateral triangle with sides length " + getSide();
		return s;
	}
}
