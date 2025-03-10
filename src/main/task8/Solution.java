package main.task8;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String convertDateToBinary(String date) {
        return Arrays.stream(date.split("-"))
                .map(string -> Integer.toBinaryString(Integer.parseInt(string)))
                .collect(Collectors.joining("-"));
    }
}
