package collection_framework;

import java.util.Stack;

public class Stacks {
    public static void main(String []args){
        Stack<String>animals=new Stack<>();
        animals.push("cow");
        animals.push("elephant");
        animals.push("hen");
        animals.push("sharks");
        animals.push("tiger");

        System.out.println(animals);

//        for(String s:animals){
//            System.out.println(s);
//        }
//        System.out.print("elements looking from the top : "+ animals.peek());
        animals.pop();
        System.out.print("elements looking from the top : "+ animals.peek());
        System.out.println(" ");
        System.out.println("After removing the elements : "+animals);
    }
}
