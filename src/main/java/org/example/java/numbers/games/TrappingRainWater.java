package org.example.java.numbers.games;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int i = 0, j = 1;
        int water = 0, tempWater;
        int tempMax = 0;
        int pouring = 0;

        for (; j < height.length; i++, j++) {
            if (height[j] - height[i] > tempMax) {
                tempMax = height[j];
                pouring = 0;
            } else {
                if (height[j] > tempMax) {
                    tempMax = height[j];
                } else {
                    tempWater = tempMax - height[j];
                    water += tempWater;
                    pouring += tempWater;
                }
            }
            if (j == height.length - 1 && tempMax > height[j]) {
                water -= pouring;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }
}

// https://leetcode.com/problems/trapping-rain-water/description/

// @TODO not completed