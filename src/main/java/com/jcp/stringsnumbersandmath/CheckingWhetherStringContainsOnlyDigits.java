package com.jcp.stringsnumbersandmath;

public class CheckingWhetherStringContainsOnlyDigits {
    public static void main(String[] args) {

    }
    public static boolean checkingWhetherStringContainsOnlyDigits(String str){
        boolean result = true;
        for(int i = 0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                result = false;
                break;
            }
        }
        return result;
    }
}
