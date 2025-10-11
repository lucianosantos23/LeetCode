package com.leetcode;

import java.util.Arrays;

public class Problem4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combinado = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            combinado[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            combinado[nums1.length + i] = nums2[i];
        }
        Arrays.sort(combinado);

        int n = combinado.length;
        if (n % 2 == 0) return (combinado[n/2 - 1] + combinado[n/2]) / 2.0;
        else return combinado[n/2];
        
    }
}
