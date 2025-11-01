package com.leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        String texto = String.valueOf(x);
        
        int tam;
        int sizeTexto = texto.length();
        if(sizeTexto%2 == 0) tam = sizeTexto/2;
        else tam = (sizeTexto-1)/2;


        for(int i = 0; i < tam; i++)
        {
            if( texto.charAt(i) != texto.charAt(sizeTexto-i-1) ) return false;
        }

        return true;

    }
}
