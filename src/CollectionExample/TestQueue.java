package CollectionExample;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    static void main(String[] args) {
        Queue <Integer> queue =  new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        Utility.print(queue);
        System.out.println("Peek: "+queue.peek());
        System.out.println("Element: "+queue.element());
        System.out.println("Removed by remove(): "+queue.remove());
        System.out.println("Removed by remove(): "+queue.remove());
        System.out.println("Removed by remove(): "+queue.remove());
        Utility.print(queue);
        //System.out.println("Removed by remove(): "+queue.remove()); //throw exception
        System.out.println("Removed by poll(): "+queue.poll());
    }
}
