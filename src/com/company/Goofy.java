package com.company;

public class Goofy extends Mickey {
    @Override
    public void greeting() {
        System.out.print("Goof Goof ");
        super.greeting();
    }
    public String toString(){
        String s = "Goofy " + super.toString();
        return s;
    }
    public void friends(){
        super.friends();
        System.out.print("Pluto ");
    }
}
