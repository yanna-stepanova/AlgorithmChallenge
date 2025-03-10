package main.task40;

class Solution {
    public int countTriplets(int[] arr) {
        int counter = 0;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int a = 0;
            for (int j = i + 1; j < size; j++) {
                a ^= arr[j - 1];
                int b = 0;
                for (int k = j; k < size; k++) {
                    b ^= arr[k];
                    if (a == b) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}

