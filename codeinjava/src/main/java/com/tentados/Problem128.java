package com.tentados;

import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap <Integer, Integer> consecutive = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int soma = 0;
            if( consecutive.get(nums[i]-1) != null || consecutive.get(nums[i]+1) != null || consecutive.get(nums[i]) != null ) 
            {
                if(consecutive.get(nums[i]-1) != null) 
                {
                    soma += consecutive.get(nums[i]-1);
                }

                if( consecutive.get(nums[i]+1) != null )
                {
                    soma += consecutive.get(nums[i]+1);
                }

                if( consecutive.get(nums[i]) != null )
                {
                    soma += consecutive.get(nums[i]);
                }

                consecutive.put(nums[i], soma+1);
            }
                
            else consecutive.put(nums[i], 1); 
        }
        return Collections.max(consecutive.values()); 
    }
}

