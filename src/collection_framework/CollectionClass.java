package collection_framework;

import java.util.*;
import java.util.Comparator;


public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(32);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(5);
        list.add(142);
        list.add(142);

        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
//        System.out.println("minimum element in the list : "+ Collections.min(list));
//        System.out.println("maximum element in the list : "+Collections.max(list));
//        System.out.println("frequency element in the list : "+Collections.frequency(list,142));
    }
}
