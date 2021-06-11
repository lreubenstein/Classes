package com.company;

public class ShortDoubleWordChecker extends DoubleWordChecker {
    private int maxLength;
    public ShortDoubleWordChecker(String one, String two, int max){
        super(one, two);
        maxLength = max;
    }
    public ShortDoubleWordChecker(String one, String two){
        super(one, two);
        maxLength = 20;
    }

    @Override
    public boolean andChecker(String word) {
        return super.andChecker(word) && word.length() < maxLength;
    }
    public boolean xorChecker(String word){
        return super.orChecker(word)&& !super.andChecker(word) &&
                word.length() < maxLength;
    }

    public static void main(String [] args){
        String s1 = "The Rain in Spain stays mainly in the plain.";
        String s2 = "Singing in the Rain";

        DoubleWordChecker dwc1 = new DoubleWordChecker("Rain", "Spain");
        System.out.println("S1 Contains both Rain and Spain " + dwc1.andChecker(s1));
        System.out.println("S2 Contains both Rain and Spain " + dwc1.andChecker(s2));
        System.out.println("S1 Contains either Rain or Spain " + dwc1.orChecker(s1));
        System.out.println("S2 Contains either Rain or Spain " +dwc1.orChecker(s2));
        System.out.println(dwc1);

        System.out.println();

        ShortDoubleWordChecker sdwc1 = new ShortDoubleWordChecker("Rain", "Spain",50);
        ShortDoubleWordChecker sdwc2 = new ShortDoubleWordChecker("Rain", "Spain");
        System.out.println("S1 Contains both Rain and Spain (long)" + sdwc1.andChecker(s1));
        System.out.println("S1 Contains both Rain and Spain (short)" + sdwc2.andChecker(s1));
        System.out.println("S1 Contains either Rain or Spain but not both " + sdwc1.xorChecker(s1));
        System.out.println("S2 Contains either Rain or Spain but not both " +sdwc1.xorChecker(s2));
    }
}
