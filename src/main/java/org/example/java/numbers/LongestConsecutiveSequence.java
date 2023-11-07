package org.example.java.numbers;

import java.util.Arrays;


public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int res = 1, counter = 1;

        for(int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            }
            if (nums[i] - nums[i - 1] == 1) {
                counter++;
            }
            else {
                res = Math.max(counter, res);
                counter = 1;
            }
        }
        return Math.max(counter, res);
    }
}

// https://leetcode.com/problems/longest-consecutive-sequence/