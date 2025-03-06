package main.day39;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            int triplet = 1;
            int decreased = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                if (decreased - nums[j] == diff) {
                    triplet++;
                    decreased = nums[j];
                }
                if (triplet == 3) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

