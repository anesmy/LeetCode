package org.example.stack;

import java.util.Deque;
import java.util.LinkedList;


public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new LinkedList<>();
        int temp;

        for (String token : tokens) {
            switch (token) {
                case "+" -> nums.push(nums.pop() + nums.pop());
                case "*" -> nums.push(nums.pop() * nums.pop());
                case "-" -> {
                    temp = nums.pop();
                    nums.push(nums.pop() - temp);
                }
                case "/" -> {
                    temp = nums.pop();
                    nums.push(nums.pop() / temp);
                }
                default -> nums.push(Integer.parseInt(token));
            }
        }
        return nums.pop();
    }
}

// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/