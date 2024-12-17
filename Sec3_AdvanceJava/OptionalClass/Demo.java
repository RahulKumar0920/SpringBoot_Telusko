import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        // List<String> names = Arrays.asList("Navin", "Laxmi", "Jhon", "Kishor");
        List<String> names = Arrays.asList("Navin", "Laksmi", "Jhon", "Kishor");

        // To avoid "NullPointException Error" , "OptionalClass" were introduce
        Optional<String> name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst(); // This will return an Optional String

        System.out.println(name.get()); // this will return "No Optional value found if we change Laxmi -> Lakshmi"
        System.out.println(name.orElse("Not Found"));

        // To avoid using optional class we can do :
        String name2 = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(name2);
    }
}