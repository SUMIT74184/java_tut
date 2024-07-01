package collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriority_queue {
    public static void main(String []a){
//        because of the comparator function we are getting the max heap
//        without it will get the min heap
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println(pq);
        pq.add(43);
        pq.add(65);
        pq.offer(12);
        pq.add(32);
        pq.add(90);
        System.out.println(pq);//everything will be printed in the sorted manner in the program
        //min heap will be implemented here
        pq.poll();
        pq.poll();//elements are removed from here

        System.out.println(pq);
//        all queue functionality will work here
        System.out.println(pq.peek());


        //max heap we need to implement the comparator function
    }
}
