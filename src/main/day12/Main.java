package main.day12;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,2},
                                     {3,4,5},
                                     {6,7,8}};
        NeighborSum neighborSum = new NeighborSum(matrix);
        int adjSum = neighborSum.adjacentSum(0);
        System.out.println(adjSum);
        int diagSum = neighborSum.diagonalSum(4);
        System.out.println(diagSum);
    }
}
