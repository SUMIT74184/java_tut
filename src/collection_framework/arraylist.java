package collection_framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String []a){
        //list interface-contigous way also we can change the size dynamically

        //normals arrays
//        int[] studentName=new int[32];//static way to declare the arrays
//        studentName[0]=12;
//        System.out.println(studentName[0]);
//
//
//
//        //arraylist
//        ArrayList<String> students=new ArrayList<>();
//        students.add("ram");
//        students.add("sunil");
//        students.add("rakesh");
//        students.add("sameer");
//        System.out.println(students);
//
//        students.add(1,"saket");
//        System.out.println(students);
//
//
//        //adding new elements
//        ArrayList<String>newList=new ArrayList<>();
//        newList.add("pankaj");
//        newList.add("mayur");
//
//        students.addAll(newList);
//        System.out.print("The new list after the updation inside : "+students);
//        System.out.println(" ");
//        System.out.println(students.get(2));
//
//
//        //remove the elements
//        students.remove(3);
//        System.out.println(students);

        List<Integer> lsi=new ArrayList<>();
        lsi.add(10);
        lsi.add(40);
        lsi.add(20);
        lsi.add(40);
        lsi.add(70);

//    lsi.remove(Integer.valueOf(40));
//    System.out.println(lsi);
//
//        lsi.clear();
//        System.out.println(lsi);
        lsi.set(2,1000);
        System.out.println(lsi);
        System.out.println(lsi.contains(400));

        for(int i=0;i<lsi.size();i++){
            System.out.println("Elements in the lsi : "+lsi.get(i));
        }

        System.out.println("   ");
        System.out.println("for each loops");
        for(Integer element:lsi){
            System.out.println("ForEach element is" + element);
        }

        Iterator<Integer> it=lsi.iterator();
        while (it.hasNext()){
            System.out.println("iterator "+it.next());
        }

    }
}
