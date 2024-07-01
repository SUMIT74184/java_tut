package collection_framework;
//import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class Queues {
    public static void main(String []a){
    Queue<Integer> que=new LinkedList<>();
    que.offer(12);
    que.offer(23);
    que.offer(43);
    que.offer(56);

        System.out.println(que);//prints the entire list
        System.out.println("first element is removed "+que.poll());//first elements will be removed
        System.out.println(que);//now the first element removed
        System.out.println("The next element which will be removed--next "+que.peek());




    }
}
