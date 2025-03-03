package com.jcp.stringsnumbersandmath;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

    }
    private static final int EXTENDED_ASCII_CODES = 256;
    public char firstNonRepeatedCharacter(String s){
        int flags[] =  new int[EXTENDED_ASCII_CODES];
        for(int i = 0;i<EXTENDED_ASCII_CODES;i++){
            flags[i] = -1;
        }
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(flags[ch] == -1){
                flags[ch] = i;
            }else{
                flags[ch]-=2;
            }
        }
        int position = Integer.MAX_VALUE;
        for(int i = 0;i<EXTENDED_ASCII_CODES;i++){
            if(flags[i] == 0){
                position = Math.min(position,i);
            }
        }
        return position == Integer.MAX_VALUE ? Character.MIN_VALUE:s.charAt(position);
    }

    public char firstRepeatedCharacterUsingLinkedHashMap(String s){
        Map<Character,Integer> lhm = new LinkedHashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!lhm.containsKey(ch)){
                lhm.put(ch,1);
            }else{
                lhm.put(ch, lhm.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> p : lhm.entrySet()){
            if(p.getValue() == 1){
                return p.getKey();
            }
        }
        return Character.MIN_VALUE;
    }
    // Writing Functional Style Code ...
}
