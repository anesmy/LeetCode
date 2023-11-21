package org.example.java.stack;

import java.util.*;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {

        if (position.length == 1) return 1;
        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (o1, o2) -> Integer.compare(o2[0], o1[0]));
        Deque<Double> deque = new LinkedList<>();

        for (int[] car : cars) {
            double timesToTarget = (double) ((target - car[0])) / car[1];
            if (deque.isEmpty() || timesToTarget > deque.peek()) {
                deque.push(timesToTarget);
            }
        }
        return deque.size();
    }
}

// https://leetcode.com/problems/car-fleet/description/