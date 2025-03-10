package main.task23;

import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1;
        int right = position[position.length - 1] - left;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canPlaceBalls(position, m, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private boolean canPlaceBalls(int[] position, int m, int minForce) {
        int count = 1;
        int lastPos = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPos >= minForce) {
                count++;
                lastPos = position[i];
                if (count == m) {
                    return true;
                }
            }
        }
        return false;
    }
}
