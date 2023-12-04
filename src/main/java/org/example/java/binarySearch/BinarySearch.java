package org.example.java.binarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int startIndex = 0, endIndex = nums.length;
        int midIndex = nums.length / 2;

        while (startIndex <= endIndex) {

            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] < target) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex - 1;
            }
            midIndex = (startIndex + endIndex) / 2;
        }
        return -1;
    }
}

// https://leetcode.com/problems/binary-search/