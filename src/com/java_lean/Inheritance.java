package com.java_lean;

class Calc{//super class
    public int add(int n,int m){
        return n+m;
    }
    public int Sub(int n,int m){
        return n-m;
    }
}
//concept of single level inheritance
class AdvCalc extends Calc {//subclass is extending

    public int multi(int n, int m) {
        return n * m;
    }


    public int Div(int n,int m){
        return n/m;
    }


}

class secondCalc extends AdvCalc{
    public int Pow(int n, int m){
        return (int)Math.pow(n,m);
    }

}
public class Inheritance {
        public static void main(String []a){
            //advance class object
    AdvCalc object=new AdvCalc();
   int r1= object.add(23,43);
    int r2= object.Sub(23,43);
   int r3= object.multi(32,21);
    int r4=object.Div(50,10);

    //secondacalc class object is defined
    secondCalc obj=new secondCalc();
    int r5=obj.Pow(3,5);
    System.out.println(r1+" "+r2+" "+r3+" "+r4+" ");
    System.out.println("value of the power is :"+r5);

        }
}
