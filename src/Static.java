class Mobile{
//varicable overhere are the instance variable
    //means they are globally shared
   static String name;
    String brand;
    String version;
    int price;

    public void show() {
        System.out.println(brand +" "+version+" "+name+" "+price);
    }
}


public class Static {
    public static void main(String []args){
    Mobile obj1=new Mobile();
    obj1.brand="Samsung";
  //  obj1.name="Smartphone";//we can still access via object name but we need to avoid it
    obj1.version="oxygen";
    obj1.price=2000;


    Mobile.name="smarty";
 //calling the static variable that is common throughout the program for all the instance

    Mobile obj2=new Mobile();
    obj2.brand="Apple";
 //   obj2.name="SmartDynamic";
    obj2.version="ios12";
    obj2.price=45000;


    obj1.show();

    obj2.show();
    }
}
