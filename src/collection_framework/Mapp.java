package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapp {
    public static void main(String[] args) {
//        Map<String,Integer>numbers=new HashMap<>();
        Map<String,Integer>numbers=new TreeMap<>();//all the values are sorted in the increasing order
        numbers.put("unitedStates",1);
        numbers.put("singapore",3);
//        numbers.put("england",5);
        //if key identical key are used then the values will be overide
        System.out.println(numbers);
        numbers.putIfAbsent("england",43);
//        overrides over here
        System.out.println("after the putifabsent"+numbers);

        //iteration in maps
        System.out.println("normals ways : "+numbers);

//        for(Map.Entry<String,Integer>e:numbers.entrySet()) {
////            System.out.println(e);
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        for(String key:numbers.keySet()){
//            System.out.println(key);
//        }
//
//        for (Integer value: numbers.values()){
//            System.out.println(value);
//        }
    }
}
