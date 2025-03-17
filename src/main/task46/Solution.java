package main.task46;

import java.util.Arrays;

class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int count = 0;
        while (count < k) {
            for (int i = 0, minNum = Arrays.stream(nums).min().getAsInt(); i < nums.length; i++) {
                if (minNum == nums[i]) {
                    nums[i] *= multiplier;
                    count++;
                    break;
                }
            }
        }
        return nums;
    }
}

