import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Tinput {
    public static void main(String []a) {
        //System.out.println();
        //system---it is class
        //out is the object---ostring
        //println---it is method from print string method
        System.out.println("enter a number");
//        int num=System.in.read();
//
//        System.out.println(num);

//        InputStreamReader in =new InputStreamReader(System.in);......//this will take the input from the user
//        BufferedReader bf =new BufferedReader(in);.....//buffer reader is resource
//        //so we need to close it once we are done with execution at the end
//        int num=Integer.parseInt(bf.readLine());.....//it reads only the string value so we need to parse
//        System.out.println(num);
//        bf.close();

        //was introduced after java 1.5
        Scanner sc=new Scanner(System.in);
        int a3=sc.nextInt();
        System.out.println(a3);
    }
}
