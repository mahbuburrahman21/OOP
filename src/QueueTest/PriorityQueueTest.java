package QueueTest;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public char ch;

    public PriorityQueueTest(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return String.valueOf(ch);
    }

    static void main(String[] args) {
        PriorityQueue<Character> queue = new PriorityQueue<>();
        queue.offer('C');
        queue.offer('B');
        queue.offer('D');
        queue.offer('A');
        queue.offer('F');
        queue.offer('B');
        queue.offer('C');
        queue.offer('D');

        for (Character c : queue) {
            System.out.print(c +" ");
        }
        System.out.println();

        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
        System.out.print(queue.poll()+" ");
    }
}