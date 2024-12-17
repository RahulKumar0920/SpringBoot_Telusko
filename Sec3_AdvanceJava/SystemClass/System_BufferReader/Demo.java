
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number : ");

        InputStreamReader in = new InputStreamReader(System.in); // This is used to pass the 'InputStreamReader' into
                                                                 // the 'BufferedReader'
        BufferedReader bf = new BufferedReader(in); // It is a way to take input from user, but it need some value
                                                    // passed "in"

        int num = Integer.parseInt(bf.readLine()); // "BufferedReader" return string type, but we need to change its
                                                   // value to int
        System.out.println(num);

        bf.close(); // we need to close "BufferedReader" resource
    }

}