package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(1));

        while (numRows != 1) {
            List<Integer> newList = generateRow(triangle.get(triangle.size() - 1));
            triangle.add(newList);
            numRows--;
        }
        return triangle;
    }

    public static List<Integer> generateRow(List<Integer> prev) {
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        for (int i = 1; i < prev.size(); i++) {
            newList.add(prev.get(i - 1) + prev.get(i));
        }
        newList.add(1);
        return newList;
    }
}
