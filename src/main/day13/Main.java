package main.day13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1},
                                     {1,0}};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.rowAndMaximumOnes(matrix)));
    }
}
