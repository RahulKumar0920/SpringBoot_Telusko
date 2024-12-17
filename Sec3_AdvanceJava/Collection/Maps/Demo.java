import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;

public class Demo {
    public static void main(String[] args) {

        // HashMap
        Map<String, Integer> students = new HashMap<>();

        students.put("navin", 56);
        students.put("harsh", 23);
        students.put("sushil", 67);
        students.put("kiran", 92);

        System.out.println(students);

        System.out.println(students.get("harsh"));

        // keys cannot be copied
        students.put("harsh", 42);
        System.out.println(students);

        // printing keys
        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

        // HashTable : Works similar to hashmap , but synchronised
        Map<String, Integer> students2 = new Hashtable<>();
    }
}
