package com.leetcode;

class Solution {
    public int strStr(String haystack, String needle) {
        boolean igual;
        for( int i = 0; i < haystack.length() - needle.length() + 1; i++  )
        {
            int inicio = i;
            igual = true;
            for( int j = 0; j < needle.length(); j++ )
            {
                if( haystack.charAt(i) != needle.charAt(j)) igual = false;
                i++;
            }
            if( igual ) return inicio;
            i = inicio;
        }
        return -1;
    }
}
