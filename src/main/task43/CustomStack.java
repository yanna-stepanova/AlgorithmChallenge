package main.task43;

import java.util.ArrayDeque;
import java.util.Deque;

class CustomStack {
    Deque<Integer> stack;
    int capacity;

    public CustomStack(int maxSize) {
        this.capacity = maxSize;
        stack = new ArrayDeque<>(maxSize);
    }
    
    public void push(int x) {
        if(stack.size() < capacity) {
            stack.push(x);
        }
    }
    
    public int pop() {
        return (!stack.isEmpty()) ? stack.poll() : -1;
    }
    
    public void increment(int k, int val) {
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i < k) ? (stack.pollLast() + val) : stack.pollLast();
        }
        for (int number : arr) {
            stack.push(number);
        }
    }
}
