package com.leetcode;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int k = 2;

        int [] salvo = new int [nums.length];

        for ( int i = 0; i < nums.length; i++) {
            salvo[i] = nums[i];
        }

        for (int i = 2; i < nums.length; i++) 
        {
            if ( nums[i] == salvo[i-1] && nums[i] == salvo[i-2] )  continue;
            else
            {
                nums[k] = nums[i];
                k++;
            }
            
        }
        
        return k;
    }
}
