package collection_framework;

import java.util.ArrayDeque;

public class array_dequeue {
    public static void main(String []a){
//we generally use it in the sliding windows questions
        ArrayDeque<Integer>adq=new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(43);
        adq.offerFirst(54);
        adq.offerFirst(65);
        adq.offerLast(21);
        adq.offerLast(45);
        System.out.println(adq);

//        for(Integer s:adq){
//            System.out.println(" ");
//            System.out.println(s);
//        }

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

//        removing the elements
        System.out.println(adq.poll());
        System.out.println(adq.pollLast());
        System.out.println(adq.pollFirst());

        System.out.println(adq);
    }
}
