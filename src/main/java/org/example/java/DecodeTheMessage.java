package org.example.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DecodeTheMessage {
    public static String decodeMessage(String key, String message) {
        List<Character> alphabet = createAlphabet(key);
        return message.chars()
                .mapToObj(ch -> (char) ch)
                .map(ch -> ch == ' ' ? ' ' : (char) (alphabet.indexOf(ch) + 'a'))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static List<Character> createAlphabet(String key){
        return key.chars()
                .filter(c -> c != ' ')
                .distinct()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }
}
