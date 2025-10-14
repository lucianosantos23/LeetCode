package com.leetcode;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indexNums2 = 0;
        for( int i = m; i <  m+n; i++)
        {
            nums1[i] = nums2[indexNums2];
            indexNums2++;
        }

        Arrays.sort(nums1);
    }
}
