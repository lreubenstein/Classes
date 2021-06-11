package com.company;

public class Rectangle {
	private int height;
	private int width;
	
	public static int count = 0;
	
	public Rectangle()
	{
		width = 1;
		height = 1;
		count++;
		System.out.println("rect");
	}
	public Rectangle(int h, int w)
	{
		if (h <= 0 || w <= 0)
		{
			throw new IllegalArgumentException(
			           "Rectangle construction error: illegal size");
		}
		height = h;
		width = w;
		count++;
		System.out.println("rect");
	}
	public Rectangle(int s)
	{
		if (s <= 0 )
		{
			throw new IllegalArgumentException(
			           "Rectangle construction error: illegal size " + s);
		}
		width = s;
		height = s;
		count++;
		System.out.println("rect");
	}

	public boolean isSquare()
	{
		return width == height;
	}
	
	public void quadratize()
	{
		double area = height * width;
		int s = (int)Math.sqrt(area);
		
		if(Math.abs(s * s- area) < Math.abs((s+1) * (s+1) - area))
		{
			height = s;
			width = s;
		}
		else
		{
			height = s+1;
			width = s+1;
		}	
		
	}
	public String toString()
	{
		return "Rectangle with height " + height + " and width " + width;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		System.out.println(r);
		try {
			Rectangle r1 = new Rectangle(-5);
			System.out.println(r1);
		}
		catch(IllegalArgumentException x){
			System.out.println("Bad Side" + x.getMessage());
		}
		Rectangle r2 = new Rectangle(4, 9);
		System.out.println(r2);
		r2.quadratize();
		System.out.println(r2);
		Rectangle r3 = new Rectangle(3,10);
		System.out.println(r3);
		r3.quadratize();
		System.out.println(r3);
		Rectangle r4 = new Rectangle(4,8);
		System.out.println(r4);
		r4.quadratize();
		System.out.println(r4);
		
		System.out.println(Rectangle.count);
		System.out.println(getCount());

	}

}
