package com.java_lean;


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
class C{

}
public class Multiple {
    public static void main(String []a){
    B obj=new B();
    obj.eating();
    }
}
