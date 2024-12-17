import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Student {

    private String name;
    private int age;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Harsh", "Jhon");

        List<Student> students = new ArrayList<>();

        // for (String name : names) {
        // students.add(new Student(name));
        // }

        // students = names.stream()
        // .map(name -> new Student(name))
        // .toList();

        students = names.stream()
                .map(Student::new) // Constructor Reference
                .toList();

        System.err.println(students);
    }
}