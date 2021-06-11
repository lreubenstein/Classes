package com.company;

public class DoubleWordChecker extends WordChecker {

    public DoubleWordChecker(String one, String two){
        super(one, two);
    }
    public boolean andChecker(String word){
        return firstSubstring(word) && secondStubstring(word);
    }
    public boolean orChecker(String word){
        return firstSubstring(word) || secondStubstring(word);
    }

    public boolean neitherChecker(String word){
        return !firstSubstring(word) && !secondStubstring(word);
    }

    public String toString(){
        return "Double Double words " + super.toString() + " are fun.";
    }
}
