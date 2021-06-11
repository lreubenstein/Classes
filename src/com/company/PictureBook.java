package com.company;

public class PictureBook extends Book {
    private String illustrator;

    public PictureBook(String n, String a, String i){
        super(n,a);
        illustrator = i;
    }

    @Override
    public void printBookInfo() {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}
