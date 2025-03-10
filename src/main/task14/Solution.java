package main.task14;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minInRow = matrix[i][0];
            int minIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    minIndex = j;
                }
            }

            boolean isMaxInColumn = true;
            for (int[] ints : matrix) {
                if (ints[minIndex] > minInRow) {
                    isMaxInColumn = false;
                    break;
                }
            }

            if (isMaxInColumn) {
                result.add(minInRow);
            }
        }
        return result;
    }
}
