package main.catware.task_1;

import java.util.stream.IntStream;

class Solution {
    private static final int LIMIT = 1000000;

    int findMultiplier(int allNumbersLessThan) {
        if (allNumbersLessThan <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer greater than zero.");
        }
        if (allNumbersLessThan > LIMIT) {
            throw new IllegalArgumentException(
                    String.format("The limit is %s. Input is too large!!!", LIMIT));
        }

        return IntStream.range(1, allNumbersLessThan)
                .filter(number -> number % 3 == 0 || number % 5 == 0)
                .sum();
    }
}

