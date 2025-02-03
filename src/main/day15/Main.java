package main.day15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] matrix = new char[][]{{'#','.','#'}};
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.rotateTheBox(matrix)));
    }
}
