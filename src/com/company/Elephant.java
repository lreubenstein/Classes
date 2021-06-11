package com.company;

public class Elephant extends Herbivore {
    private double tuskLen;
    public Elephant(String n, double len){
        super("elephant", n);
        tuskLen = len;
    }
    public String toString(){
        String s = super.toString();
        s += " with tusks " + tuskLen + " meters long.";
        return s;
    }
}
