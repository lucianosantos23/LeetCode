package com.leetcode;

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> map = new HashMap<>();

        String [] arrayS = s.split(" ");

        if( pattern.length() != arrayS.length ) return false;

        for( int i = 0; i < pattern.length(); i++ )
        {
            char caracterP = pattern.charAt(i);
            String stringS = arrayS[i];

            String value = map.get(caracterP);
            if( value != null) 
            {
                if(!value.equals(stringS)) return false;
            }
            else
            {
                if(map.containsValue(stringS)) return false;
                map.put(caracterP, stringS);
            }
        }
        return true;
    }
}
