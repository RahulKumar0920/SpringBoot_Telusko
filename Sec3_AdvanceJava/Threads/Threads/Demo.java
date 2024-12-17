//In threads if we want to used thread we need to define run method inside the class using thread.
//We are running multiple threads at the same time.
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");

            // we can use "Thread.sleep('milliseconds')" to ask scheduler to wait before
            // next execution
            // we have to use try-catch block because , "Thread.sleep()" is a uninturrupted
            // error, and we need to handle such errors
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {

        // The below define objects are threads once there class extends to Threads
        A objA = new A();
        B objB = new B();

        // System.out.println(objA.getPriority()); // can be used to find priority of a
        // thread
        objB.setPriority(Thread.MAX_PRIORITY); // SetPriority ranges from 1 to 10, and constants can also be used

        objA.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        objB.start();

    }

}