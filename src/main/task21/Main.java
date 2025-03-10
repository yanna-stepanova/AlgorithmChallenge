package main.task21;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{4,3,2,-1},
                                     {3,2,1,-1},
                                     {1,1,-1,-2},
                                     {-1,-1,-2,-3}};
        Solution solution = new Solution();
        System.out.println(solution.countNegatives(matrix));
    }
}
