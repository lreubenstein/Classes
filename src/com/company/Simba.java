package com.company;

public class Simba extends Belle {
    public void greeting(){
        System.out.print("Roar");
    }
    public String toString(){
        return super.toString() + "King Simba";
    }
    public void friends(){
        movie();
        System.out.print("Pumba and Timone");
    }

}
