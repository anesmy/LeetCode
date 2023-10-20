package org.example.java.numbers;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0, tempSum = 0;
        for (int g : gain) {
            tempSum = g + tempSum;
            max = Math.max(max, tempSum);
        }
        return max;
    }
}

// https://leetcode.com/problems/find-the-highest-altitude/
