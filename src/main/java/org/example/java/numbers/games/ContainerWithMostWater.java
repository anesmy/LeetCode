package org.example.java.numbers.games;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int area, maxArea = 0;

        while(i < j) {
            area = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(area, maxArea);

            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}

// https://leetcode.com/problems/container-with-most-water/description/