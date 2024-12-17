import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        // Another way to take input in a list
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        /*
         * // 1st way to print Elemnts of List : normal For Loop
         * for (int i = 0; i < nums.size(); i++) {
         * System.out.println(nums.get(i));
         * }
         * 
         * // 2nd way to print Elemnts of List : Advance For Loop
         * for (int n : nums) {
         * System.out.println(n);
         * }
         * 
         * // 3nd way to print Elemnts of List : For Each Loop
         * nums.forEach(n -> System.out.println(n));
         */

        // 1st way to perform operations on list
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
            }
        }

        // 2st way to perform operations on list : Stream
        /*
         * // Stream basically creates a copy of data : s1 <- nums
         * // operations are performed on streams, doesnot affect the original values
         * // once we use it we cannot reuse it
         * // benifit of using stream : provides a lot of methods
         * Stream<Integer> st = nums.stream();
         * Stream<Integer> st2 = st.filter(n -> n % 2 == 0); // this will return its
         * value to a new stream
         * Stream<Integer> st3 = st2.map(n -> n * 2);
         * 
         * int result = st3.reduce(0, (c, e) -> c + e); // this will not return a new
         * stream, but a value
         * 
         * // st3.forEach(n -> System.out.println(n)); //once we have used st3 in the
         * result it will not be used again
         */

        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // st.forEach(n -> System.out.println(n)); // it will not work again

        // System.out.println(nums);
        // System.out.println("Sum of odd number 'times 2' = " + sum);

    }
}