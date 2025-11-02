
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class cillec {
    public static void main(String[] args) {

        // List from collection
        Collection<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10;i++) {
            nums.add(i);
        }
        System.out.println(nums);

        // List from  List we can use when needed index related operation
        List<Integer> num = new ArrayList<Integer>();


        // Set  unsorted
        Set<Integer> setEx = new HashSet<Integer>();

        // set sorted
        Set<Integer> setEx2 = new TreeSet<Integer>();


        // map
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("ram", 1231);
        students.put("rm", 121);
        System.out.println(students);

        
    }
}
