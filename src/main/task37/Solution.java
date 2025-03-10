package main.task37;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        int size = words.length;
        for (int i = 0; i < size; i++) {
            String reverseItem = new StringBuilder(words[i]).reverse().toString();
            for (int j = i + 1; j < size; j++) {
                if (reverseItem.equals(words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}

