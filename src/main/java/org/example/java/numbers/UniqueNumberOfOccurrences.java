package org.example.java.numbers;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Long> occurrences = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(identity(), counting()));

        return occurrences.values().stream().distinct().count() == occurrences.values().size();
    }
}

// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75