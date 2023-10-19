package org.example.java.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return new ArrayList<>() {{
            add(findDifferenceInOneArray(nums1, nums2));
            add(findDifferenceInOneArray(nums2, nums1));
        }};
    }

    private List<Integer> findDifferenceInOneArray(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1)
                .distinct()
                .filter(n1 -> Arrays.stream(nums2).noneMatch(n2 -> n2 == n1))
                .boxed().toList();
    }
}

// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75