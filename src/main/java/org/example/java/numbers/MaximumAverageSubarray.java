package org.example.java.numbers;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        double sum, maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        sum = maxSum;

        for(int i = 0; i < nums.length - k; i++) {
            sum = sum - nums[i] + nums[k + i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k;
    }
}

