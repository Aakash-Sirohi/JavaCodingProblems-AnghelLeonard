package com.jcp.stringsnumbersandmath;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Problem number #1
public class CountingDuplicateCharacters  {
    // Count the duplicate characters in a given String
    public static void main(String[] args) {
        // For Example there is a String = "aakash sirohi";
        // Return or Print the number of Duplicate Characters in this String

        // Method 1
        HashMap<Character, Integer> characterHashMap = new HashMap<>();
        String s = "aakash sirohi";
        for (int i = 0; i < s.length(); i++) {
            if (!characterHashMap.containsKey(s.charAt(i))) {
                characterHashMap.put(s.charAt(i), 1);
            } else {
                characterHashMap.put(s.charAt(i), characterHashMap.get(s.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> p : characterHashMap.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }

        //Method 2
        Map<Character, Integer> cmap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            cmap.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> p : cmap.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }

        //Method 3
        // This method used Java 8's stream feature.
        // Let us solve this in 3 steps

        // 1 - Converting the given String in to Stream<Character> by calling String.chars() -> This returns IntStream
        // 2 - Transforming IntStream into Stream of Characters with the help of mapToObj() method
        // 3 - Grouping and Counting the Characters

        Map<Character,Long> result = s.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        for (Map.Entry<Character, Long> p : result.entrySet()) {
            System.out.println(p.getKey() + " " + p.getValue());
        }

        // ASCII stands for American Standard Code for Information Interchange
        // ASCII Characters between 0-31 are non-printable
        // ASCII Characters between 32-127 are printable
        // ASCII Characters between 128-255 are extended

        // UTF stands for Unicode Transformation Format
        // Early versions of Unicode contained values less than 65535
        // Java represents there characters using 'char' which is 16 bits in size
        // So calling charAt(i) works good until 'i' does not exceed 65535
        // Unicode added more characters now maximum value is 1114111
        // These Characters do not fit into 16-bits
        // So 32-bit values (also known as Code Points) were considered for UTF-32 encoding scheme
        // Unfortunately, Java doesn't support UTF-32!
        // Now a high surrogate followed by a low surrogate defines what is known as a surrogate pair
        // Surrogate pairs are used to represent values between 65536 and 1114111

        // Re-writing the code for surrogate pairs

        Map<String,Integer> spmap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            int cp = s.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if(Character.charCount(cp) == 2){
                i++;
            }
            spmap.compute(ch , (k,v)->v==null ? 1:++v);
        }

        // Re-writing in functional style

        Map<String , Long> fsmap = s.codePoints().mapToObj(c->String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
    }
}
