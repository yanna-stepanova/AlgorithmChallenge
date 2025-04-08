package main.task62;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,9,3};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.decrypt(array, -2)));
    }
}
