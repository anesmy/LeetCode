package org.example.java;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {
    private List<Integer> requests;

    public RecentCounter() {
        requests = new ArrayList<>();
    }

    public int ping(int t) {
        requests.add(t);
        return (int) requests.stream()
                .filter(r -> r <= t && r >= t - 3000)
                .count();
    }
}

// https://leetcode.com/problems/number-of-recent-calls/description/?envType=study-plan-v2&envId=leetcode-75