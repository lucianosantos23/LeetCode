package com.leetcode;

class Solution {
    public int removeDuplicates(int[] nums) {
        int aux = -101;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if( nums[i] != aux ) 
            {
                nums[k] = nums[i];
                k++;
                aux = nums[i];
            }
        }   
        return k;
    }
}
