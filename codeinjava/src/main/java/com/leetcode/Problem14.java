package com.leetcode;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefixo = strs[0];
        for(int i = 1; i < strs.length; i++ )
        {
            int index = 0;
            String novoPrefixo = "";
            int menorIndice = Math.min(prefixo.length(), strs[i].length());

            while( index < menorIndice && prefixo.charAt(index) == strs[i].charAt(index) )
            {
                novoPrefixo = novoPrefixo + prefixo.charAt(index);
                index++;
            }
            prefixo = novoPrefixo;

        }

        return prefixo;
    }
}