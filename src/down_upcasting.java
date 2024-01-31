import java.awt.*;

class Computer
{
    public void show1(){
        System.out.println("inside the processor");
    }
}
class Mac extends Computer
{
    public void show2(){
        System.out.println("inside the mac os");
    }
}

public class down_upcasting {
    public static void main(String []a){
//        double d=4.5;
//        int i=(int)d;//overhere we are typcasting
//        System.out.println(i);

        //upcasting method
        //parent reference and child object
        Computer cp =(Computer)new Mac();
        cp.show1();
//      cp.show2(); cannot call the show2 methods

//        Mac mv =new Mac();
//        mv.show1(); normal obejct of class mac


        //downcasting here we have the reference of Class MAC
        //BUT the object is of class computer
        //child reference and parents object
        Mac mv=(Mac)cp;
        mv.show2();
        mv.show1();

    }
}
