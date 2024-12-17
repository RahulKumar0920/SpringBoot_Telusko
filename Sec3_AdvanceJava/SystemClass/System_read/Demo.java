
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a Number : "); // System (class) -> out (call as a class name for PrintStream) ->
                                                 // println (method call for println)
                                                 // println
        int num = System.in.read(); // This will create an Exception, to handle that exception we have to call
                                    // IOException
                                    // "System.in.read()" will return the ASCII value for the entered value, it will
                                    // only accept one value at a time
        System.out.println(num - 48); // "num - 48" is used to return the entered value in the by the user, otherwise
                                      // it will return an ASCII value for it
    }
}