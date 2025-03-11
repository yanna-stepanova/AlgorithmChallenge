package main.task42;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int opened = 0;
        for (char item : s.toCharArray()) {
            if (item == '(') {
                if (opened > 0) {
                    result.append(item);
                }
                opened++;
            } else {
                opened--;
                if (opened > 0) {
                    result.append(item);
                }
            }
        }
        return result.toString();
    }
}

