package main.task41;

import java.util.Stack;

class Solution {
    public String clearDigits(String s) {
        Stack<Character> myStack = new Stack<>();
        for (Character item : s.toCharArray()) {
            if (!Character.isDigit(item)) {
                myStack.push(item);
            } else {
                myStack.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        myStack.forEach(result::append);
        return result.toString();
    }
}

