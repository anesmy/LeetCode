package org.example.java.binarySearch;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[left] <= nums[mid]) {
                if (nums[mid] >= target && nums[left] <= target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid] <= target && nums[right] >= target) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

// https://leetcode.com/problems/search-in-rotated-sorted-array/