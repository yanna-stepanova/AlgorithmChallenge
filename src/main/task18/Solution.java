package main.task18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pairs = new HashMap<>();
        generateMap(s, pairs);
        int i = 0;
        while (i < s.length()) {
            Integer value = pairs.get(s.charAt(i));
            value = findLastIndex(s, i, value, pairs);
            result.add(s.substring(i, value + 1).length());
            i = value + 1;
        }
        return result;
    }

    private int findLastIndex(String string,int from, int to, Map<Character, Integer> pairs) {
        int lastIndex = pairs.get(string.charAt(to));
        int i = from;
        while (i < lastIndex) {
            if (pairs.get(string.charAt(i)) > lastIndex) {
                lastIndex = pairs.get(string.charAt(i));
            }
            i++;
        }
        return lastIndex;
    }

    private void generateMap(String s, Map<Character, Integer> pairs) {
        for (int i = 0; i < s.length(); i++) {
            if (!pairs.containsKey(s.charAt(i))) {
                pairs.put(s.charAt(i), s.lastIndexOf(s.charAt(i)));
            }
        }
    }
}

