package org.example.java.words;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
            String forward = s.chars().filter(c -> Character.isDigit(c) || Character.isLetter(c))
                    .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                    .toString()
                    .toLowerCase();

        return forward.equals(new StringBuilder(forward).reverse().toString());
    }
}

// https://leetcode.com/problems/valid-palindrome/description/