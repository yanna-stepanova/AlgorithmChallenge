package main.day20;

class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] result = new int[n + 1];
        for (int i = 0, end = n, start = 0; i < n; i++) {
            result[i] = (s.charAt(i) == 'D') ? end-- : start++;
            if (i == n - 1) {
                result[i + 1] = start;
            }
        }
        return result;
    }
}

