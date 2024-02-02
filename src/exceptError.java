public class exceptError {
    public static void main(String []a){
        int i=0;
        double j=0;
        int nums[]=new int[3];
        nums[2]=34;
        nums[1]=21;
        nums[0]=32;

        try{
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[3]);
           //putting the multiple statement inside the
        }
        catch(ArithmeticException e){
            System.out.println("something is defect");
        }//only in case of exception
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }
        catch(Exception e){
            System.out.println("something went wrong in the program");
        }
        System.out.println(j);
    }
}
