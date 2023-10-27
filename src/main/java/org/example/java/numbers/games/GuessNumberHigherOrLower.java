package org.example.java.numbers.games;

import java.util.Random;

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        Random random = new Random();
        int result;
        int max = n + 1, min = 1;
        int num = random.nextInt(max - min) + min;

        while ((result = guess(num)) != 0) {
            if (result == 1) {
                min = num + 1;
            } else {
                max = num;
            }
            num = random.nextInt(max - min) + min;
        }
        return num;
    }
}

// https://leetcode.com/problems/guess-number-higher-or-lower/description/?envType=study-plan-v2&envId=leetcode-75
