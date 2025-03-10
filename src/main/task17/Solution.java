package main.task17;

class Solution {
    public String makeSmallestPalindrome(String s) {
        int middle = s.length() / 2;
        StringBuilder leftPart = new StringBuilder();
        for (int i = 0, j = s.length() - 1; i < middle; i++,j--) {
            leftPart.append((s.charAt(i) < s.charAt(j)) ? s.charAt(i) : s.charAt(j));
        }
        StringBuilder result = new StringBuilder(leftPart);
        if (s.length() % 2 != 0) {
            result.append(s.charAt(middle));
        }
        result.append(leftPart.reverse());
        return result.toString();
    }
}

