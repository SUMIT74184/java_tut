import java.sql.SQLOutput;

class Human{

  private int age;
   private String name;

   //we can also change the name of getter and setter but that's not good practice
   public int getAge(){
       return age;
   }
   public void setAge(int a){
       age=a;//using the setter
   }
   public String getName(){
       return name;
   }
   public void setName(String name1){
        name=name1;
   }

}

public class Encapsulation {
    public static void main(String []a){
        Human obj=new Human();
//        System.out.println(obj.getAge());
//        System.out.println(obj.getName());//accessing the private data in the form of method
//        obj.age=11;
//        obj.name="summit";

        obj.setAge(12);
        System.out.println("updated age format in the program"+" "+obj.getAge());
        obj.setName("sumit_rai");
        System.out.println("updated name in the method"+" "+obj.getName());
    //binding the method with data is termed as the encapsulation
    }
}
