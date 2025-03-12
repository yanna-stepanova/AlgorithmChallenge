package main.task43;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomStack stk = new CustomStack(3); // Stack is Empty []
        stk.push(1);                          // stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        System.out.println(stk.pop());          // return 2 --> Return top of the stack 2, stack becomes [1]
        stk.push(2);                          // stack becomes [1, 2]
        stk.push(3);                          // stack becomes [1, 2, 3]
        stk.push(4);
        System.out.println(Arrays.toString(stk.stack.toArray())); // stack still [1, 2, 3], Do not add another elements as size is 4
        stk.increment(5, 100);                // stack becomes [101, 102, 103]
        System.out.println(Arrays.toString(stk.stack.toArray()));
        stk.increment(2, 100);                // stack becomes [201, 202, 103]
        System.out.println(Arrays.toString(stk.stack.toArray()));
        System.out.println(stk.pop());        // return 103 --> Return top of the stack 103, stack becomes [201, 202]
        System.out.println(stk.pop());        // return 202 --> Return top of the stack 202, stack becomes [201]
        System.out.println(stk.pop());        // return 201 --> Return top of the stack 201, stack becomes []
        System.out.println(stk.pop());        // return -1 --> Stack is empty return -1.
    }
}
