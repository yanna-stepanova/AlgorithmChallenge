package main.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String sortVowels(String s) {
        String vowelsString = "AEIOUaeiou";
        ArrayList<Character> arrLetters = new ArrayList<>();
        ArrayList<Integer> arrIndexes = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (vowelsString.contains(String.valueOf(s.charAt(i)))) {
                arrLetters.add(s.charAt(i));
                arrIndexes.add(i);
            }
        }
        List<Character> sortedResult = arrLetters.stream()
                .sorted()
                .toList();
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < sortedResult.size(); i++) {
            result.setCharAt(arrIndexes.get(i), sortedResult.get(i));
        }
        return result.toString();
    }
}
