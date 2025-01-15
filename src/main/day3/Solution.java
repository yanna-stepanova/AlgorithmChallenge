package main.day3;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> commonArray = new HashSet<>();
        for (int i = 0; i < nums1.length;  i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] ) {
                    commonArray.add(nums1[i]);
                }
            }
        }
        int[] result = new int[commonArray.size()];
        int i = 0;
        for (int item : commonArray) {
            result[i++] = item;
        }
        return result;
    }
}
