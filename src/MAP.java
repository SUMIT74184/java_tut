import java.util.HashMap;
import java.util.Map;

public class MAP {
    public static void main(String []a){
        //map always store in key value pair format
        Map<String, Integer> students=new HashMap<>();
        students.put("sumit",87);
        students.put("david",88);
        students.put("karan",98);
        students.put("shiv",76);
        students.put("karan",100);//key cannot be repeated they are unique
//so we are getting the unique and the latest values
        System.out.println(students);
        System.out.println(students.get("shiv"));//return the value associated with it
        System.out.println(students.values());//will return all the values
        //combination of list and set
        System.out.println(students.keySet());//return the key


        for(String key : students.keySet()){
            System.out.println(key+ " : "+ students.get(key));//return the key and value associated with it.
        }
        System.out.println(students.remove(98));
    }
}
