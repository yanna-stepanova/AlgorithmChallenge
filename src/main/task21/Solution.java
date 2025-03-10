package main.task21;

import java.util.Arrays;

class Solution {
    public int countNegatives(int[][] grid) {
        return (int) Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num < 0)
                .count();
    }
}

