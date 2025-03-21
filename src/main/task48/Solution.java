package main.task48;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int largestInteger(int num) {
        String number = String.valueOf(num);
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        for (char c : number.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                evens.add(digit);
            } else {
                odds.add(digit);
            }
        }
        odds.sort(Collections.reverseOrder());
        evens.sort(Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        int oddIndex = 0, evenIndex = 0;
        for (char c : number.toCharArray()) {
            int digit = c - '0';
            if (digit % 2 == 0) {
                result.append(evens.get(evenIndex++));
            } else {
                result.append(odds.get(oddIndex++));
            }
        }
        return Integer.parseInt(result.toString());
    }
}
