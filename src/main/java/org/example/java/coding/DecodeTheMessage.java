package org.example.java.coding;

import java.util.List;
import java.util.stream.Collectors;

public class DecodeTheMessage {
    public String decodeMessage(String key, String message) {
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
}
