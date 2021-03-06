package com.tbkj;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();
        
        stack.push("J");
        stack.push("K");
        stack.push("B");
        stack.push("T");

        while(!stack.isEmpty()) {
            String element = stack.peek();
            System.out.print(element);
            stack.pop();
        }

        System.out.println();
    }
}
