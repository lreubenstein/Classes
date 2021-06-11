package com.company;

public class PasswordGenerator {
    private int length;
    private String prefix;
    private static int count=0;
    public PasswordGenerator(int len, String pre){
        length = len;
        prefix = pre;
    }
    public PasswordGenerator(int len){
        length = len;
        prefix = "A";
    }

    public int pwCount(){
        return count;
    }

    public String pwGen(){
        count++;
        double x = Math.pow(10,length);
        int ran = (int)(Math.random()*x);
        return prefix + "." +ran;
    }

    public static void main(String[] args){
        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw1.pwCount());
    }
}
