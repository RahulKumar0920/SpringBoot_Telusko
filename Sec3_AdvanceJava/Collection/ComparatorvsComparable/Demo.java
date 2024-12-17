import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//this is the implementation of comparable
//if we want to give power to the class to compare itself is comparable 
class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age= " + age + " name= " + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Demo {
    public static void main(String[] args) {

        // comparator is used to define our own logic
        // we will used its predefined abstract method "compare"
        /*
         * Comparator<Integer> com = new Comparator<Integer>() {
         * public int compare(Integer i, Integer j) {
         * if (i % 10 > j % 10) {
         * return 1;
         * } else {
         * return -1;
         * }
         * }
         * };
         * 
         * 
         * List<Integer> nums = new ArrayList<>();
         * nums.add(34);
         * nums.add(56);
         * nums.add(71);
         * nums.add(17);
         * 
         * // We are sorting a list on its last digit of the number
         * Collections.sort(nums, com); // add our own logic using "com"
         * 
         * System.out.println(nums);
         */

        // For String
        // Comparator<Student> comp = new Comparator<Student>() {
        // public int compare(Student i, Student j) {
        // if (i.age > j.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // Lamda Expression
        Comparator<Student> comp = (i, j) -> i.age > j.age ? 1 : -1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "Jhon"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kiran"));

        Collections.sort(studs, comp);

        for (Student s : studs) {
            System.out.println(s);
        }

    }
}