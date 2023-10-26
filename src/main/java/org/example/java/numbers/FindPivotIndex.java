package org.example.java.numbers;

import java.util.Arrays;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum, rightSum;
        for(int i = 0; i < nums.length; i++) {
            leftSum = 0; rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int j = nums.length - 1; j > i; j--) {
                rightSum += nums[j];
            }
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}

// https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75