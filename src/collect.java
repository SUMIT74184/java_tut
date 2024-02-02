import java.util.*;

public class collect {
    public static void main(String []a){//no indexing in the collection
        Collection <Integer>nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(9);

//        for(int n: nums){
//            System.out.println(n);
//        }

        List<Integer>numb=new ArrayList<Integer>();
        numb.add(4);
        numb.add(41);
        numb.add(14);
        numb.add(48);
        System.out.println(numb.get(3));
        System.out.println(numb.indexOf(14));
        //list support duplicate value


//      Set<Integer> a5=new HashSet<Integer>();
        Set<Integer>a5=new TreeSet<Integer>();
        a5.add(90);
        a5.add(9);
        a5.add(92);
        a5.add(129);
        a5.add(39);
        System.out.println(a5);//does not follow sequence or the order

        Iterator<Integer> values=a5.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
