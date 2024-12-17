
class RahulException extends Exception {
    public RahulException(String str) {
        super(str);
    }
}

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }
}

public class Demo {

    static {
        System.out.println("Class Loaded....");
    }

    public static void main(String[] args) {
        // Never add throws to main class because then jvm will not run the code as we
        // should not let jdk handle exceptions

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        int i = 20;
        int j = 0;

        /*
         * // int nums[] = new int[5];
         * // String str = null;
         */

        try {

            // if we get the error even in the first line inside the try block it will jump
            // out of the try block and goes to catch block
            j = 18 / i;
            if (j == 0) {
                // throw new ArithmeticException("Cannot print zero!");
                // Custom exception
                throw new RahulException("Cannot print zero!");
            }

            /*
             * System.out.println(str.length());
             * System.out.println(nums[1]);
             * System.out.println(nums[5]);
             */

        } catch (RahulException e) {

            j = 18 / 1;
            System.out.print("That's the default output! -> " + e);

        } catch (ArithmeticException e) {

            // System.out.println("Cannot Divide by Zero");
            j = 18 / 1;
            System.out.print("That's the default output! -> " + e);

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Array index out of Bound!" + e);

        } catch (Exception e) {

            System.out.println("Error!" + e);

        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
