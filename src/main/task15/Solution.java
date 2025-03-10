package main.task15;

class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char[][] result = new char[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = boxGrid[i][j];
            }
        }
        for (int col = 0; col < m; col++) {
            int emptyRow = n - 1;
            for (int row = n - 1; row >= 0; row--) {
                if (result[row][col] == '*') {
                    emptyRow = row - 1;
                } else if (result[row][col] == '#') {
                    if (row != emptyRow) {
                        result[emptyRow][col] = '#';
                        result[row][col] = '.';
                    }
                    emptyRow--;
                }
            }
        }
        return result;
    }
}

