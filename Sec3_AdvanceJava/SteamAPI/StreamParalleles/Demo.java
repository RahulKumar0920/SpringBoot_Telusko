import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Demo {
    public static void main(String[] args) {

        int size = 10_000; // we can use '_' between large numbers
        List<Integer> nums = new ArrayList<>(size); // we can predefine size of a List

        Random ran = new Random(); // it is used to create random values

        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100)); // "ran.nextInt(100)" 100 is defining the upperbound value of random numbers
        }

        // System.out.println(nums);

        // int sum1 = nums.stream()
        // .map(i -> i * 2)
        // .reduce(0, (c, e) -> c + e);

        // Sequential
        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }

                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        // Parallel
        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {

                    }

                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();

        // System.out.println(sum1 + " " + sum2 + " " + sum3);
        System.out.println(sum2 + " " + sum3);
        System.out.println("Seg : " + (endSeq - startSeq));
        System.out.println("Para : " + (endPara - startPara));
    }
}