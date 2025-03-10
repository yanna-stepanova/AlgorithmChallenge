package main.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> result = solution.stableMountains(new int[]{1, 2, 3, 4, 5}, 2);
        result.forEach(System.out::println);
    }
}
