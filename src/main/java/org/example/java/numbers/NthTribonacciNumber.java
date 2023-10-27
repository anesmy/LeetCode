package org.example.java.numbers;

import java.util.ArrayList;
import java.util.List;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);
        sequence.add(1);

        int temp, res = 0;
        if (n > 2) {
            for (int i = 3; i <= n; i++) {
                temp = sequence.subList(i - 3, i)
                        .stream().mapToInt(Integer::intValue)
                        .sum();
                sequence.add(i, temp);

                if (i == n) res = temp;
            }
        } else res = sequence.get(n);

        return res;
    }
}

// https://leetcode.com/problems/n-th-tribonacci-number/description/?envType=study-plan-v2&envId=leetcode-75