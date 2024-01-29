class Mobile1 {
    String network;
    int price = 2000;
    String brand;
    static String name;

    //static block
    static {
        String name = "phone";//nothing gonna happen
        System.out.println("hi static here");
    }

    // Initializing the constructor
    public Mobile1() {
        network = "SMTP";
        price = 3000;
        brand = "ios";

        System.out.println("constructor");
    }

    // Change access modifier to public
    public void show() {
      //  System.out.println(brand + " " + network + " " + price + " " + name);
    }


    //this is how we can call the static method by passing the object reference
    public static void show1(Mobile1 obj1){
//this method can be called directly from the class name itself
        System.out.println(obj1.brand + " " + obj1.network + " " + obj1.price + " " + obj1.name);
    }
}

public class Static_method {
    public static void main(String[] args) {
        // Creating an instance of the Mobile class
        Mobile1 obj1 = new Mobile1();
        Mobile1.name="smart";
        // Calling the show method to display the values
        obj1.show();//calling the non-static method

      Mobile1.show1(obj1);//calling the static method



        }
    }

