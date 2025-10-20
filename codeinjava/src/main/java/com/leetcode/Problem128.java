package com.leetcode;

import java.util.HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> tamSequencia = new HashMap<>();
        int maior = 0;

        for (int num : nums) {
            if (!tamSequencia.containsKey(num)) {
                int left = tamSequencia.getOrDefault(num - 1, 0);
                int right = tamSequencia.getOrDefault(num + 1, 0);
                int sum = left + 1 + right;
                tamSequencia.put(num, sum);

                //atualiza os valores dos extremos
                tamSequencia.put(num - left, sum); 
                tamSequencia.put(num + right, sum);

                maior = Math.max(maior, sum);
            }
        }

        return maior;
    }
}

