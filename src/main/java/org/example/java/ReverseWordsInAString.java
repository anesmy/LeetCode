package org.example.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" ")).map(str -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }).collect(Collectors.joining(" "));
    }
}
