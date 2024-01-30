package com.java_lean;
import java.util.ArrayList;


class A{
    public void eating(){
        System.out.println("bhai yeh wala method");
    }
    public void config(){
        System.out.println("operation in config");
    }
}

class B extends A{
    public void eating(){
        System.out.println("bhai method 2 correct hai");
    }

}

//Now the problem of AMBIGUITY IS ARISE in the program
class C extends B{
    public int eating(int a,int b){
        int n1;
        return n1=a-b;

    }
}
public class Multiple {
    public static void main(String []a){
    B obj=new B();
    obj.eating();

//  int r4= obj.eating(3,5);
    C on=new C();
 int r=on.eating(3,5);
    System.out.println(r);

    ArrayList list=new ArrayList();
    list.add(3,2);
    }
}
