package main.task11;

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length - 2;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = findMax(grid, i, j);
            }
        }
        return result;
    }

    private int findMax(int[][] grid, int iFrom, int jFrom) {
        int max = Integer.MIN_VALUE;
        for (int i = iFrom; i < iFrom + 3; i++) {
            for (int j = jFrom; j < jFrom + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}
