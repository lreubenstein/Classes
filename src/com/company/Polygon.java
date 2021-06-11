package com.company;

public class Polygon {
    private int numsides;
    private String name;
    public Polygon(int s, String n){
        numsides = s;
        name = n;
    }
    public Polygon(){
        numsides=3;
        name = "";
    }
    public int getNumsides(){
        return numsides;
    }
    public String getName(){
        return name;
    }

}


