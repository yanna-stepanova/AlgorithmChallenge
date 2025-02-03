package main.day16;

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder(word);
        if (word.contains(String.valueOf(ch))) {
            result.delete(0, result.length());
            int index = word.indexOf(ch);
            result.append(word, 0,  index + 1).reverse().append(word, index + 1, word.length());
        }
        return result.toString();
    }
}

