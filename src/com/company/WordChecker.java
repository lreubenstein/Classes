package com.company;

public class WordChecker {
    private String firstWord;
    private String secondWord;

    public WordChecker(String one, String two){
        firstWord = one;
        secondWord = two;
    }
    // returns True if firstWord is a substring of word
    public boolean firstSubstring(String word){
        return word.contains(firstWord);
    }
    // returns True if secondWord is a substring of word
    public boolean secondStubstring(String word){
        return word.contains(secondWord);
    }

    public String toString(){
        return firstWord + " " + secondWord;
    }
}
