package com.leetcode;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int saldoMax = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; 
            } else {
                int saldo = price - minPrice;
                if (saldo > saldoMax) {
                    saldoMax = saldo;
                }
            }
        }

        return saldoMax;
    }
}
