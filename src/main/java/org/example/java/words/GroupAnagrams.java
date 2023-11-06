package org.example.java.words;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs).collect(Collectors.groupingBy(s -> s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining())
        )).values().stream().toList();
    }
}

// https://leetcode.com/problems/group-anagrams/