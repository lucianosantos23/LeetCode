package com.leetcode;

import java.util.HashMap;

public class Solution {  
    public class Item
    {
         int indice;
         int valor;
        public Item(int indice, int valor) {
            this.indice = indice;
            this.valor =valor;
        }
        
    }


    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Item> hash = new HashMap<>();
        int [] resultado = new int [2];
        for(int i = 0; i < nums.length; i++)
        {
            if( hash.get(nums[i]) != null )
            {
                resultado[0] = hash.get(nums[i]).indice; 
                resultado[1] = i;
            }
            hash.put(target-nums[i], new Item(i, nums[i]));
        }

        return resultado;
    }
}
