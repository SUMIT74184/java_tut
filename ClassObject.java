

class Calc{
    int a;
    //properties and method
    public int add(int num1,int num2){//variable method
        int result=num1+num2;
        return result;
        
    }
}
public class ClassObject {

    public static void main(String []args){
        // int num1=2;
        // int num2=21;//primitive datatype
        // int result=num1+num2;
        // System.out.println(result);

//creating the first object here
        Calc obj= new Calc();
       int myresult= obj.add(34,67);
       System.out.println(myresult);
    }
}
