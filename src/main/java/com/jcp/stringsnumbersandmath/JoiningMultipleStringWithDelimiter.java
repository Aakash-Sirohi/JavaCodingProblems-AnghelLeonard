package com.jcp.stringsnumbersandmath;

public class JoiningMultipleStringWithDelimiter {
    public static void main(String[] args) {

    }
    public static String joiningMultipleStringWithDelimiter(char delimiter ,String...str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length-1;i++){
            sb.append(str[i]).append(delimiter);
        }
        sb.append(str[str.length-1]);
        return sb.toString();
    }
}
