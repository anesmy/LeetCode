package org.example.java.numbers;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        var occurrences = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return occurrences.values().stream().anyMatch(v -> v > 1);
    }
}

// https://leetcode.com/problems/contains-duplicate/