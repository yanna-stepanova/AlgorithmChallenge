package main.task13;

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCounter = 0;
        int rowIndex = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int number : mat[i]) {
                count += number;
            }
            if (maxCounter < count) {
                maxCounter = count;
                rowIndex = i;
            }
        }
        return new int[]{rowIndex, maxCounter};
    }
}
