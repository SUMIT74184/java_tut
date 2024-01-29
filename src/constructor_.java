class const_{
    private int reciept;
    private String data;

//default const
    public const_(){
        //constructor has the same name as the class_name
        //does not have any return type in the function
        reciept=12;
        data="New york time-square";
        System.out.println("inside the constructor");
    }


    //creating the parameterized constructor
    public const_(int a,String b){
        reciept=a;
        data=b;

        //we can pass multiple attributes in this
    }
    public int getReciept() {
        return reciept;
    }

    //whenever we need to assign the operation value
    //we use method named as constructor
    public void setReciept(int reciept) {
        this.reciept = reciept;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}
public class constructor_ {
    public static void main(String []a){
    const_ object=new const_();
    //evey time we create the object of our new class the constructor will be called
        //by default
       System.out.println(object.getData());//calling out data with help of the constructor
        const_ object2=new const_(21,"germany-berlin");
        System.out.println(object2.getReciept()+" "+object2.getData());


    }
}
