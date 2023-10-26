package org.example.java.coding;

public class StringCompression {
    public int compress(char[] chars) {

        char prev = chars[0];
        int counter = 1;
        int index = 0;

        for(int i = 1; i < chars.length + 1; i++) {

            if (i == chars.length || prev != chars[i]) {

                chars[index++] = prev;
                if (counter != 1) {
                    for (char c : Integer.toString(counter).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                if (i < chars.length) {
                    counter = 1;
                    prev = chars[i];
                }
            } else
                counter++;
        }
        return index;
    }
}

// https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75