package org.example.java.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int prevTemp = stack.pop();
                answer[prevTemp] = i - prevTemp;
            }
            stack.add(i);
        }
        return answer;
    }
}

//    public int[] dailyTemperatures(int[] temperatures) {
//        int length = temperatures.length;
//        int[] answer = new int[length];
//
//        for (int i = 0; i < length - 1; i++) {
//            int counter = 1;
//
//            while (temperatures[i] >= temperatures[i + counter]) {
//                counter++;
//                if (i + counter >= length) {
//                    counter = 0;
//                    break;
//                }
//            }
//            answer[i] = counter;
//        }
//        answer[length - 1] = 0;
//        return answer;
//    }

// https://leetcode.com/problems/daily-temperatures/description/