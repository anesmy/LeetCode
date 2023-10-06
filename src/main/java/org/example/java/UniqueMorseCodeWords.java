package org.example.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        List<String> translated = Arrays.stream(words).map(w -> w.chars()
                .mapToObj(l -> (char) l)
                        .map(l -> morse[l - 'a'])
                        .collect(Collectors.joining())).toList();
        return (int) translated.stream().distinct().count();
    }
}
