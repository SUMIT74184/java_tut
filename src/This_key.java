
class Insaan{
    private int ID;
    private String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {//parameter in the function is an local variable
        this.ID = ID;
    }
    //this.id is an instance variable it is possible that the both name are same
    //but we need to use this keyword
    //else the preference is given to the local variable
    //creating the new object is not the good idea
    //"this" act as current object which is calling the

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class This_key {
    public static void main(String []a){
        Insaan obj=new Insaan();
        obj.setID(23);
        System.out.println(obj.getID());

        obj.setName("arjun");
        System.out.println(obj.getName());
    }
}
