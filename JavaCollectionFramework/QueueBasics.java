package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        // queue -> for insertion use offer() for removal use poll() and
        // for front head access use peek()S
        // LinkedList
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println("Removing : " + q.poll());
        System.out.println("Front node : " + q.peek());
        System.out.println(q);

        // ArrayDeque
        Queue<Integer> arrdq = new ArrayDeque<>();
        arrdq.offer(100);
        arrdq.offer(200);
        arrdq.offer(300);
        System.out.println(arrdq);
        System.out.println(arrdq.peek());
        System.out.println(arrdq.poll());
        System.out.println(arrdq);

        // ArrayDeque using Deque
        Deque<Integer> arrdq1 = new ArrayDeque<>();
        arrdq1.offer(12);
        arrdq1.offerFirst(11);
        arrdq1.offer(13);
        System.out.println(arrdq1);
        System.out.println(arrdq1.pollFirst());
        System.out.println(arrdq1.pollLast());
        System.out.println(arrdq1);
        arrdq1.offer(13);
        arrdq1.offer(14);
        System.out.println(arrdq1);
        System.out.println(arrdq1.peekFirst());
        System.out.println(arrdq1.peekLast());
        System.out.println(arrdq1.size());

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(2);
        pq.offer(4);
        pq.offer(3);
        pq.offer(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        pq.offer(1);

        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
