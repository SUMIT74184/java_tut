public class type_conversion {
    public static void main(String []args){
        int a=257;
        byte c=98;
        a=c;
       System.out.println(a);
       //type conversion concept
       byte k=(byte)a;

    //    c=k;
       k=c;
    System.out.println("value of updated k is"+ k);


        //type promotion concept
       byte x=10;
       byte b=124;
        int result=x*b;
        System.out.println(result);
    }
}
