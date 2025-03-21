package main.task50;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        List<List<Integer>> gridList = copyMatrix(grid);
        while (!gridList.get(0).isEmpty()) {
            sum += findMaxInEachRow(gridList);
        }
        return sum;
    }

    private int findMaxInEachRow(List<List<Integer>> gridList) {
        List<Integer> arrMax = new ArrayList<>();
        for (List<Integer> rowList : gridList) {
            int maxValue = Integer.MIN_VALUE;
            int indexMax = -1;
            for (int j = 0; j < rowList.size(); j++) {
                Integer item = rowList.get(j);
                if (maxValue < item) {
                    maxValue = item;
                    indexMax = j;
                }
            }
            if (indexMax > -1) {
                arrMax.add(rowList.remove(indexMax));
            }
        }
        return arrMax.stream().max(Integer::compare).orElseGet(() -> 0);
    }

    private List<List<Integer>> copyMatrix(int[][] grid) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> list = new ArrayList<>();
            for (int number : row) {
                list.add(number);
            }
            matrix.add(list);
        }
        return matrix;
    }
}

