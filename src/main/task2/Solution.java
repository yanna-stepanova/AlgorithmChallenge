package main.task2;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int missingNumber(int[] nums) {
        int lastNum = nums.length;
        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
        int[] ints = IntStream.rangeClosed(0, lastNum).toArray();
        return Arrays.mismatch(ints, sortedNums);
    }
}
