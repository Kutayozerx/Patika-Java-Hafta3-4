package main.java.collections_list.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> breadQueue = new PriorityQueue<>();

        breadQueue.add("Cem");
        breadQueue.add("Kutay");
        breadQueue.add("Ahmet");
        breadQueue.add("Mehmet");

        System.out.println(breadQueue);

        breadQueue.remove();

        System.out.println(breadQueue);

    }
}
