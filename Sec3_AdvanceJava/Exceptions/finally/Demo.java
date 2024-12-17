import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {

        /*
         * Finally keyword is used when we want to execute a line on code once while
         * using try catch blocks
         */

        // int i = 0;
        // int j = 0;
        // try {
        // j = 18 / 0;
        // } catch (ArithmeticException e) {
        // System.out.println("Cannot divide by zero!");
        // } finally {
        // System.out.println("Bye!");
        // }

        /*
         * Finally keyword is mostly used to close a resource , and it is not compulsory
         * to use catch keywords
         */
        // int num = 0;
        // BufferedReader br = null; // It is define outside try, so that we can use it
        // in finally keyword
        // try {

        // // InputStreamReader in = new InputStreamReader(System.in);
        // // br = new BufferedReader(in);
        // // same as above ||
        // br = new BufferedReader(new InputStreamReader(System.in));
        // num = Integer.parseInt(br.readLine());
        // System.out.println(num);

        // } finally {

        // br.close();

        // }

        // We can also close resources directly without using try-finally block
        int num = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            num = Integer.parseInt(br.readLine());
            System.out.println(num);

        }

    }
}