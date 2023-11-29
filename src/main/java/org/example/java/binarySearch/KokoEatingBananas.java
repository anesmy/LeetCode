package org.example.java.binarySearch;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().orElse(0);
        int min = 1;

        while (min < max) {
            int hours = 0;
            int mid = (min + max) / 2;

            for (int pile : piles) {
                hours += Math.ceil(pile /(double) mid );
            }

            if (hours > h) {
                min = 1 + mid;
            } else {
                max = mid;
            }
        }
        return max;
    }
}

//https://leetcode.com/problems/koko-eating-bananas/description/
