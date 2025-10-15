package com.leetcode;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) 
        {
            char caracter = magazine.charAt(i);
            Integer count = hash.get(caracter);
            if (count == null) hash.put(caracter, 1); 
            else hash.put(caracter, count + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) 
        {
            char caracter = ransomNote.charAt(i);
            Integer count = hash.get(caracter);

            if (count == null || count <= 0) return false; 
            else hash.put(caracter, count - 1);            
        }

        return true;
    }
}
