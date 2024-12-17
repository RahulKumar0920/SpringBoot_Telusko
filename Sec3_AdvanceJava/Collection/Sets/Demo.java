package Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        // List
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(1);

        // for (Object n : nums) {
        // System.out.println(n);
        // }
        // System.out.println("Get Method " + nums.get(3));
        // System.out.println("IndexOf Method " + nums.indexOf(1));

        // Set
        Set<Integer> nums2 = new HashSet<Integer>();
        nums2.add(6);
        nums2.add(5);
        nums2.add(7);
        nums2.add(1);

        // for (int n : nums2) {
        // System.out.println(n);
        // }

        // Set : TreeSet
        Set<Integer> nums3 = new TreeSet<Integer>();
        nums3.add(6);
        nums3.add(5);
        nums3.add(7);
        nums3.add(1);

        // for (int n : nums3) {
        // System.out.println(n);
        // }

        // Iterator

        Iterator<Integer> values = nums3.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}