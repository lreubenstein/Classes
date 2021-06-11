package com.company;

public class Triangle extends Polygon {
    private boolean isosceles;
    public Triangle(String name, boolean iso){
        super(3, name);
        isosceles = iso;
    }
    public Triangle(){
        super(3, "");
        isosceles = false;
    }

    public boolean isIsosceles() {
        return isosceles;
    }

    public static void main(String [] args){
        Polygon [] p = new Polygon [3];
        p[0] = new Polygon(6, "hex");
        p[1] = new Triangle("tri", true);
        p[2] = new Triangle("tri2", false);

        Polygon tri = new Triangle("ttt",true);

        System.out.println(p[0].getNumsides());
        System.out.println(p[1].getNumsides());
        //System.out.println(p[1].isIsosceles());

        //tri.isIsosceles();


    }
}
