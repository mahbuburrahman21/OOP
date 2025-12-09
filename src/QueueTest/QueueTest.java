//package QueueTest;
//
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class QueueTest implements Comparator <QueueTest>{
//    public char ch;
//
//    public QueueTest(char ch) {
//        this.ch = ch;
//    }
//    public char getCh() {
//        return ch;
//    }
//    @Override
//    public int compare(QueueTest o1, QueueTest o2) {
//        return o2.getCh() - o1.getCh();
//    }
//
//    @Override
//    public String toString() {
//        return String.valueOf(ch);
//    }
//
//    static void main(String[] args) {
//        Queue <QueueTest> ch = new LinkedList<>();
//        ch.offer(new QueueTest('C'));
//        ch.offer(new QueueTest('B'));
//        ch.offer(new QueueTest('D'));
//        ch.offer(new QueueTest('A'));
//        ch.offer(new QueueTest('F'));
//        ch.offer(new QueueTest('B'));
//        ch.offer(new QueueTest('C'));
//        ch.offer(new QueueTest('D'));
//
//        //Display Queue situation now
//        for (QueueTest c : ch) {
//            System.out.print(" "+c);
//        }
//        System.out.println();
//
//        System.out.println("Polling ......");
//
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.poll());
//        System.out.println(ch.size());
//    }
//}