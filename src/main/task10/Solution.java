package main.task10;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> validStrings(int n) {
        List<String> intsList = new ArrayList<>();
        generateBinaryStrings(n, "", intsList);
        return intsList;
    }

    private void generateBinaryStrings(int n, String prefix, List<String> result) {
        if (n == 0) {
            result.add(prefix);
            return;
        }
        if (prefix.isEmpty() || prefix.charAt(prefix.length() - 1) == '1') {
            generateBinaryStrings(n - 1, prefix + "0", result);
        }
        generateBinaryStrings(n - 1, prefix + "1", result);
    }
}
