//import java.util.Objects.toString;


public class string_buffer {
    public  static void main(String[] args){
        StringBuffer sb=new StringBuffer("sumit");

        System.out.println(sb.capacity());//provide the extra 16 space
        System.out.println(sb.length());//provide the length


        sb.deleteCharAt(2);
        sb.insert(2,"m");


        sb.setLength(10);
        System.out.println(sb);
    }

   
}
