package stackdemo;

import java.util.*;

public class UseQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        Queue<Integer> queue1 = new ArrayDeque<>();


        queue.add("Aroz");
        queue.add("Rifat");
        queue.add("Ahmed");
        queue.add("Farzana");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
