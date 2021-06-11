package com.company;

public class Animal {
    String type;
    String species;
    String name;

    public Animal(String t, String s, String n){
        type = t;
        species = s;
        name = n;
    }
    public String toString(){
        String s;
        s = name + " the " + species + " is a " + type;
        return s;
    }
}
