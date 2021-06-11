package com.company;

public class Disney {
    public static void main(String[] args){
        Mickey [] dc = {new Belle(), new Simba(), new Goofy()};
        for(Mickey m:dc){
            m.movie();
            System.out.println();
            m.friends();
            System.out.println();
            System.out.println(m);
            System.out.println();
        }
    }
}
