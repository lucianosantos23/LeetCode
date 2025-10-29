package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lista = new ArrayList<>();

        for (String string1 : strs) {
            boolean adicionado = false;

            for (List<String> listaInterna : lista) {

                if (!listaInterna.isEmpty()) {
                    String string2 = listaInterna.get(0);
                    if (isAnagram(string1, string2)) {
                        listaInterna.add(string1);
                        adicionado = true;
                        break; 
                    }
                }
            }

            if (!adicionado) {
                List<String> novaLista = new ArrayList<>();
                novaLista.add(string1);
                lista.add(novaLista);
            }
        }

        return lista;
    }
    
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
