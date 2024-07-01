package collection_framework;

import java.util.Arrays;

public class ArrClass {
    public static void main(String[] args) {
//        int[] numbers={23,34,45,56,67,78,89};
//        int index= Arrays.binarySearch(numbers,67);
//        System.out.println(index);

        int[] numbers={10,2,3,41,0,21,3,6,7};
        Arrays.sort(numbers);

        for(int i:numbers){
            System.out.println(i);
        }
    }
}
