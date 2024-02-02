class AN {//our main class
    public void show() {
        System.out.println("inside the AN");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {

        AN obj = new AN() //no semicolon-termination
        {//anonymous class implementation

            public void show() {
                System.out.println("inside the anonymous class");
            }
        };

        obj.show();
        //our object is calling the method of the anonymous class
    }
}

//we can also use the abstract class method inside the anonymous class
