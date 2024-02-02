//interface do not have the memory space in the heap
//class-class->extends
//interface-interface->extends
//class-interface->implements
interface A1{
//    variable in the interfaces are static and final by default so we have to assign the value
    void carSpeed();//we cannot create the object of an interface in program
    void CarEngine();
}

//we can have multiple interfaces
//inheritance can be used in the interface
class Operating implements A1{
    @Override
    public void carSpeed() {

        System.out.print("the speed is high....");
    }

    @Override
    public void CarEngine() {
        System.out.println("above the matrix...");
    }
}

public class Interface {
    public static void main(String []a){
    A1 object =new Operating();
    object.CarEngine();
    object.carSpeed();

    }
}
