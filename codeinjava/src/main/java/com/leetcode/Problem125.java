package com.leetcode;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", ""); //remove espaços e virgulas

        int pointerLeft = 0;
        int pointerRight = s.length()-1;

        while( pointerLeft <= pointerRight )
        {
            if( s.charAt(pointerRight) != s.charAt(pointerLeft)) return false;
            pointerLeft++;
            pointerRight--;
        }

        return true;
    }
}
