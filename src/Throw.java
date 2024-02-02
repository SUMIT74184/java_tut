class myException extends Exception{//also extends Runtimes
    public myException(String string){//need to create the constructor
        super(string);
    }
}

public class Throw {
    static{
        System.out.println("loading");
    }
    public static void main(String []a){
        int f=20;
        int b=0;

        try{
            Class.forName("sim");
            b=7/f;
            if(b==0)
                throw new myException("cannot print");//creating the object of the throw
        }
        catch (myException e){
            b=27/1;
            System.out.println("sending the default value"+" "+e);
        }//over here the message is catched
        catch (ClassNotFoundException e){
            System.out.println("class not found ....please select the appropriate class"+" "+e);
        } catch (Exception e){
            System.out.println("something went wrong"+e);
        }
        finally{//this statement is going to execute no matter what
            System.out.println("bye statement");
            //bf.close...this meant for it
        }
        System.out.println(b);
    }
}
