class Counter{
    int count;
    // "synchronized" it will tell your java code that this method should be used by one thread at a time
    public synchronized void increment(){
        count++;
    }
}

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // '.join' is a way to ask your main thread to wait until other threads come and join
        t1.join();
        t2.join();

        System.out.println(c.count);

    }

}