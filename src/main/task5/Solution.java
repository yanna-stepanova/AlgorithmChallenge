package main.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> countMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy( num -> num, Collectors.summingInt(num -> 1)));
        List<List<Integer>> result = new ArrayList<>();
        while (!countMap.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> iterator = countMap.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                row.add(entry.getKey());
                if (entry.getValue() == 1) {
                    iterator.remove();
                } else {
                    countMap.put(entry.getKey(), entry.getValue() - 1);
                }
            }
            result.add(row);
        }
        return result;
    }

}
