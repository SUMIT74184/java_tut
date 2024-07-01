package collection_framework;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String []a){

    Set<student>studentset=new HashSet<>();
    studentset.add(new student("rohan",21));
        studentset.add(new student("ramesh",22));
        studentset.add(new student("sanket",23));
        studentset.add(new student("anil",21));

        System.out.println(studentset);
    //no duplicate elements are allowed inside.....same property for the all the collections
//    Set<Integer> set=new HashSet<>(); // O(1) time complexity
//    Set<Integer> set=new LinkedHashSet<>();//only order is maintained in which the element are inserted
//    Set<Integer>set=new TreeSet<>();//all the elements will be in the sorted format only ---increasing order ...log n
//    set.add(32);
//    set.add(78);
//    set.add(89);
//    set.add(90);
//    set.add(32);//second one printed over here...all elements are hashed inside the set and then verified it as unique
//        set.remove(32);
//        System.out.println(set);
//        System.out.println(set.contains(89));
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
//        set.clear();


    }
}


