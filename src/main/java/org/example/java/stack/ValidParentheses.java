package org.example.java.stack;


import java.util.Stack;


public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {

            switch (c) {
                case '{' -> stack.add('}');
                case '[' -> stack.add(']');
                case '(' -> stack.add(')');
                default -> {
                    if (stack.empty() || stack.pop() != c) {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}

// https://leetcode.com/problems/valid-parentheses/description/
