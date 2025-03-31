package main.task56;

class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] result = new  long[nums.length];
        long maxLong = 0L;
        for (int i = 0; i < result.length; i++) {
            maxLong =  Math.max(maxLong, nums[i]);
            long current = nums[i] + maxLong;
            result[i] = (i > 0) ? current + result[i - 1] : current;
        }
        return result;
    }
}

