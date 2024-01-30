public class Main {
    public static void main(String[] args) {
        final int num=90;

     String name="sumit";
        //System.out.println(name);

     //   String name1=new String("sumit_rai");
        String name1="sumit";
        name1=name+ "rai0";
        if(name==name1){
            System.out.println(name1+" "+name);
        }
        //string are immutable because it maintain the const pool
        //cannot change the data
        //so all object will store the same memory address
        //this will save the storage

        System.out.println(name.charAt(1));/* provide me the value present at the particular index */
    }
    
    
}