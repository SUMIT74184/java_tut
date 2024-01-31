
//class inside the class
class Parent{
    int age;
    public void show(){
        System.out.println("here we have the value of show..."+age);
    }

    class InTo{
        public void config(){
            System.out.println("executing the inside operation");
        }

    }
}

public class InnerClass {
    public static void main(String []a){
        Parent obj =new Parent();//normal parent class
        obj.show();


    }
}
