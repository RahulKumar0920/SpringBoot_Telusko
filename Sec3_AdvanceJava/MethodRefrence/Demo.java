import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Harsh", "Jhon");

        // List<String> uNames = names.stream()
        // .map(name -> name.toUpperCase())
        // .toList();

        List<String> uNames = names.stream()
                .map(String::toUpperCase) // '::' this is called method reference, when we want to pass funtion inside function, we need to metion class name or Object name to use it
                .toList();

        // System.out.println(uNames);

        uNames.forEach(System.out::println);

    }
}