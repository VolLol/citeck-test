package org.citeck.test.second;

import java.util.Stack;

public class SecondTask {

    public static void main(String[] args) {
        String input = "([][]()])";
        char[] inputArray = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean itsOk = true;
        for (char c : inputArray) {
            if (c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        itsOk = false;
                        break;
                    }
                }
            }
        }
        if (!stack.isEmpty()) {
            itsOk = false;
        }
        System.out.println(itsOk);
    }



}
