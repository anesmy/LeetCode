package org.example.java.words;

import java.util.Objects;
import java.util.stream.Collectors;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return Objects.equals(sort(s), sort(t));
    }

    private String sort(String s) {
        return s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted()
                .collect(Collectors.joining());
    }
}


// https://leetcode.com/problems/valid-anagram/description/
