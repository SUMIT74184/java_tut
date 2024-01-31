//now we are implementing the abstract class
abstract class Car{//abstract class
    public abstract void drive();

    public void PlayMusic(){
        System.out.println("music is playing ....");
    }
}
//when the parent class don't know the execution or the operation then the abstract method are declared
//now the subclass will use this method
//provide the logics,operation to it

class WagonR extends Car{//concrete class
    public void drive(){//it is necessary to define this method or else it will throw an error
        System.out.println("driving...");
    }
}
public class Abstract {
    public static void main(String []a){
        Car obj=new WagonR();
        obj.drive();
        obj.PlayMusic();
  // Here we are unable to create the object of the abstract class
  //however we can create the reference of class Car

    }
}
