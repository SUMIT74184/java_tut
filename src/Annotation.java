class per{
    public void show(){
        System.out.println("inside the per");
    }
}
class Anu extends per{
    @Override//compiler will help me out by showing the problem in the program
    public void show(){

        System.out.println("inside the Anu");

    }
}
public class Annotation {
    public static void main(String []a){
        per p=new per();
        p.show();
    }
}
