package main.task4;

import java.util.ArrayList;
import java.util.stream.IntStream;

class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> arrayOfMax = new ArrayList<>();
        int currentMax = getCurrentMaxOfArray(nums);
        arrayOfMax.add(currentMax);
        int steps = (int) IntStream.of(nums).distinct().count();
        for (int i = 1; i < steps; i++) {
            currentMax = getCurrentMaxOfArray(generateArrayWithoutMax(currentMax, nums));
            if (!arrayOfMax.contains(currentMax)) {
                arrayOfMax.add(currentMax);
            }
        }
        return (arrayOfMax.size() >= 3)
                ? arrayOfMax.get(2)
                : getCurrentMaxOfArray(nums);
    }

    private int[] generateArrayWithoutMax(int max, int[] currentNums) {
        return IntStream.of(currentNums)
                .filter(num -> num < max)
                .toArray();
    }

    private int getCurrentMaxOfArray(int[] array) {
        return IntStream.of(array).max().getAsInt();
    }
}
