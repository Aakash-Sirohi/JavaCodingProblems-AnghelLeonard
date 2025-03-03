package com.jcp.stringsnumbersandmath;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicateCharacters  {
    // Count the duplicate characters in a given String
    public static void main(String[] args) {
        // For Example there is a String = "aakash sirohi";
        // Return or Print the number of Duplicate Characters in this String

        HashMap<Character,Integer> characterHashMap = new HashMap<>();
        String s = "aakash sirohi";
        for(int i = 0;i<s.length();i++){
            if(!characterHashMap.containsKey(s.charAt(i))){
                characterHashMap.put(s.charAt(i),1);
            }else{
                characterHashMap.put(s.charAt(i),characterHashMap.get(s.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer> p : characterHashMap.entrySet()){
            System.out.println(p.getKey() + " " + p.getValue());
        }
    }
}
