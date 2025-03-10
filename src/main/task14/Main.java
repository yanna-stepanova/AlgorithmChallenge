package main.task14;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3,6},
                                     {7,1},
                                     {5,2},
                                     {4,8}};
        Solution solution = new Solution();
        System.out.println(solution.luckyNumbers(matrix));
    }
}
