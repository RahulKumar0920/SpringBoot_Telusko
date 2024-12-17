/*
class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {

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

        // If we check the Thread implementation we will get to know that we can pass
        // Runnable values into the Thread
        Runnable objA = new A();
        Runnable objB = new B();

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

    }

}
*/

/* Using Anonymus & Lamda Expression */
public class Demo {
    public static void main(String[] args) {

        // If we check the Thread implementation we will get to know that we can pass
        // Runnable values into the Thread

        Runnable objA = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hi");

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            };


        Runnable objB = () -> {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hello");

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

    }

}