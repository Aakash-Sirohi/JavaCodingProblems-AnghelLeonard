package com.jcp.stringsnumbersandmath;

public class ReversingLetterAndWords {
    public static void main(String[] args) {

    }
    private static final String WHITESPACE = " ";
    public String reversingLettersAndWords(String str){
        String s[] = str.split(WHITESPACE);
        StringBuilder sb = new StringBuilder();
        for(String word :  s){
            StringBuilder wrd = new StringBuilder();
            for(int i = word.length()-1;i>=0;i--){
                wrd.append(word.charAt(i));
            }
            sb.append(wrd.toString());
            sb.append(WHITESPACE);
        }
        return sb.toString();
    }
}
