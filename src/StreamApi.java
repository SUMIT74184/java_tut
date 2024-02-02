import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] a) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 91, 1);

        Stream<Integer> s3 = nums.stream();
        Stream<Integer> s2 = s3.filter(n -> n % 2 == 0);
        Stream<Integer> s4 = s2.map(n -> n * 2);

        // Print the filtered elements
//        System.out.println("Filtered Elements:");
//        s2.forEach(n -> System.out.println(n));

        // Print the mapped elements
        System.out.println("Mapped Elements:");
        s4.forEach(n -> System.out.println(n));

        // Create a new stream from the original list to print all elements
//        System.out.println("Original Elements:");
//        nums.forEach(n1 -> System.out.println(n1));
    }
}
