package com.jcp.stringsnumbersandmath;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class CountingOccurrencesOfACertainCharacter {
    public static void main(String[] args) {

    }
    public static int countOccurrencesOfACertainCharacter(String str, char ch){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    public static long functionalCountOccurrencesOfACertainCharacter(String str,char ch){
//        Predicate<Integer> isThatChar = c ->  c == ch;
//        long characterCount = str.chars().filter(c->c == ch).count();
        return str.chars().filter(c -> c==ch).count();
    }
}
