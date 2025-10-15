package com.leetcode;

class Solution {
    public boolean isHappy(int n) {
        String num = String.valueOf(n);
        while( num.length() > 1 || num.charAt(0) != '4'  )
        {
            int soma = 0;
            for( int i = 0; i < num.length(); i++)
            {
                int c = num.charAt(i)-'0';
                soma += c*c;
            }
            if(soma == 1) return true;
            num = String.valueOf(soma);
        }
        return false;
    }
}