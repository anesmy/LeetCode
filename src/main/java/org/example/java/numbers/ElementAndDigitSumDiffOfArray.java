package org.example.java.numbers;

import java.util.Arrays;

public class ElementAndDigitSumDiffOfArray {
    public int differenceOfSum(int[] nums) {
        int elementSum = Arrays.stream(nums).sum();
        int digitSum = Arrays.stream(nums)
                .mapToObj(n -> String.valueOf(n).split(""))
                .map(digits -> Arrays.stream(digits).mapToInt(Integer::parseInt).sum())
                .mapToInt(Integer::intValue)
                .sum();

        return Math.abs(elementSum - digitSum);
    }
}
