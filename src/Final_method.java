//final keyword used in ---variable,method,class
class Calci{// if we use the final keyword no other class is able to inherit
    public void show(){
        System.out.println("hello this is parent class");
    }
    public final int add(int n,int m){//final method is used so that the feature cannot be used anymore
        return n+m-1;
    }
}
class AdvaCalci extends Calci
{
    public void show()
    {
        System.out.println("hello child class AKA subclass is here");
    }

    @Override
    public String toString() {
        return "AdvaCalci{}";
    }
//    public int add(int x,int y)//here is the problem
//    {
//        return ((x+9)+(y+2));
//    }
}
public class Final_method {
    public static void main(String []a){
        AdvaCalci ad=new AdvaCalci();
        int p=ad.add(3,6);
        System.out.println("the value of program calss adv :"+p);

    }

}
