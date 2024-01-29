class A {
    public A(){
        super();
        System.out.println("anonymous object created");
        System.out.println("inside A now");
    }
    public A(int n){
        super();
        System.out.println("inside the A ---parameterized");
    }
}
class B extends A{

   public B(){
       super(9);
       System.out.println("inside normal const");
   }
    public B(int n){
        super();//mentioning the super call
        System.out.println("inside the B ----parameterized");
    }

}

public class super_anonymous_object {
    public static void main(String []a){
       // B obj=new B();
        System.out.println("creating the reference object ");
      A obj1 =new A(9);//reference object


        System.out.println(" ");
        System.out.println("creating the object without the reference.....");
        new A();//Anonymous object in the program
    }
}
