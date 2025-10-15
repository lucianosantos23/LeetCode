package com.leetcode;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        int length = s.length();
        for (int i = 0; i < length; i++) 
        {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            Character mappedChar = map.get(charS);

            if (mappedChar != null) 
            {
                if (mappedChar != charT) return false;
            } else 
            {
                boolean valueExists = map.containsValue(charT);
                if (valueExists) return false;
                map.put(charS, charT);
            }
        }

        return true;
    }
}

