package com.leetcode;

class Solution {
    public void rotate(int[] nums, int k) 
    {
        int index = 0;
        int salvo [] = new int[nums.length];    
        
        System.arraycopy(nums, 0, salvo, 0, nums.length);

        k = k%nums.length;
        
        for( int i = (nums.length-k); i < nums.length; i++ ) nums[index++] = salvo[i];
        for( int i = 0; i < (nums.length-k); i++) nums[index++] = salvo[i];
    }
}
