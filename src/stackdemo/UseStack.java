package stackdemo;

import java.util.ArrayList;
import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Plate1");
        stack.push("plate2");
        stack.push("plate3");

        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
