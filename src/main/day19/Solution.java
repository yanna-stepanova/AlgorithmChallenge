package main.day19;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int size = s.length();
        int[] ints = new int[size];
        int leftItem = s.indexOf(c);
        String substring = s.substring(leftItem + 1);
        int rightItem = substring.indexOf(c) + leftItem + 1;
        for (int i = 0; i < size; i++) {
            int distLeft = Math.abs(i - leftItem);
            int distRight = Math.abs(i - rightItem);
            if (i == rightItem) {
                leftItem = rightItem;
                substring = s.substring(leftItem + 1);
                rightItem = leftItem + 1 + substring.indexOf(c);
            } else {
                ints[i] = Math.abs(distLeft < distRight ? distLeft : distRight);
            }
        }
        return ints;
    }
}

