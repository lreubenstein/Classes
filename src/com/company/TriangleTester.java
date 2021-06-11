package com.company;

public class TriangleTester {

	public static void main(String[] args) {
		ATriangle [] ttt= new ATriangle[4];
		
		ttt[0] = new RightTriangle(4);
		ttt[1] = new RightTriangle(6);
		ttt[2] = new EquiTriangle(4);
		ttt[3] = new EquiTriangle(6);
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println(ttt[i]);
			System.out.println("Area = " + ttt[i].getArea());
			System.out.println("Perimeter = " + ttt[i].getPerimeter());
			System.out.println("Ratio = " + ttt[i].getRatio());
		}
	}

}
/*
 * A right triangle with legs length 4.0
Area = 8.0
Perimeter = 13.65685424949238
Ratio = 0.585786437626905
A right triangle with legs length 6.0
Area = 18.0
Perimeter = 20.485281374238568
Ratio = 0.8786796564403575
An equilateral triangle with sides length 4.0
Area = 6.928203230275509
Perimeter = 12.0
Ratio = 0.5773502691896257
An equilateral triangle with sides length 6.0
Area = 15.588457268119896
Perimeter = 18.0
Ratio = 0.8660254037844387
*/
