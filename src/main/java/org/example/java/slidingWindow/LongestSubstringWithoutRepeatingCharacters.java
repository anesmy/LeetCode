package org.example.java.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        List<Character> substring = new ArrayList<>();
        int longest = 0;

        for (Character c : s.toCharArray()) {
            if (substring.contains(c)) {
                substring.subList(0, substring.indexOf(c) + 1).clear();
            }
            substring.add(c);
            longest = Math.max(longest, substring.size());
        }
        return longest;
    }
}

// https://leetcode.com/problems/longest-substring-without-repeating-characters/