package com.java_lean;
import java.util.*;


//method overriding
class Met{
    public void show()
    {
        System.out.println("in the show method___met");
    }
}
class space extends Met{
    public void show()
    {
        System.out.println("inside the show method___space");
    }
}
//both of the class have the same method

class Snp extends space{
    public void show(){
        System.out.println("inside the c___snp");
    }
}
public class PolyMorphism {
    public static void main(String []a){
    System.out.println("poly");
//common instance
    Met m=new Met();
    m.show();
    //met class method will be called

//now we can also assign the new m object to second class
    m=new space();
    m.show();
    //space class method will be called


    m=new Snp();
    m.show();
    }
}
