package main.task12;

import java.util.ArrayList;
import java.util.List;

class NeighborSum {
    private List<List<Integer>> listInts;

    public NeighborSum(int[][] grid) {
        listInts = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            for (int number : row) {
                listRow.add(number);
            }
            listInts.add(listRow);
        }
    }
    
    public int adjacentSum(int value) {
        int[] arrPosition = findPosition(value);
        return (arrPosition != null) ? findAdjacent(arrPosition[0], arrPosition[1]) : 0;
    }

    public int diagonalSum(int value) {
        int[] arrPosition = findPosition(value);
        return (arrPosition != null) ? findDiagonal(arrPosition[0], arrPosition[1]) : 0;
    }

    private int[] findPosition(int value) {
        for (int i = 0; i < listInts.size(); i++) {
            for (int j = 0; j < listInts.get(i).size(); j++) {
                if (listInts.get(i).get(j) == value) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private int findAdjacent(int indexRow, int indexColumn) {
        int sum = 0;
        int size = listInts.size();
        int topRow = indexRow - 1;
        int bottomRow = indexRow + 1;
        int rightColumn = indexColumn + 1;
        int leftColumn = indexColumn - 1;
        if (topRow >= 0) {
            sum += listInts.get(topRow).get(indexColumn);
        }
        if (bottomRow < size) {
            sum += listInts.get(bottomRow).get(indexColumn);
        }
        if (rightColumn < size) {
            sum += listInts.get(indexRow).get(rightColumn);
        }
        if (leftColumn >= 0) {
            sum += listInts.get(indexRow).get(leftColumn);
        }
        return sum;
    }

    private int findDiagonal(int indexRow, int indexColumn) {
        int sum = 0;
        int size = listInts.size();
        int topRow = indexRow - 1;
        int bottomRow = indexRow + 1;
        int rightColumn = indexColumn + 1;
        int leftColumn = indexColumn - 1;
        if (topRow >= 0 && leftColumn >= 0) {
            sum += listInts.get(topRow).get(leftColumn);
        }
        if (topRow >= 0 && rightColumn < size) {
            sum += listInts.get(topRow).get(rightColumn);
        }
        if (bottomRow < size && leftColumn >= 0) {
            sum += listInts.get(bottomRow).get(leftColumn);
        }
        if (bottomRow < size && rightColumn < size) {
            sum += listInts.get(bottomRow).get(rightColumn);
        }
        return sum;
    }
}
