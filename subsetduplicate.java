import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetduplicate {

    public static void main(String[] args) {
    
    }

    public List<List<Integer>> subsetduplicate(int[] nums) {
        Arrays.sort(nums); // sort the array
        List<List<Integer>> parent = new ArrayList<>();
        parent.add(new ArrayList<>());
        for (int val : nums) {
            int n = parent.size();
            for (int i = 0; i < n; i++) {
                List<Integer> child = new ArrayList<>(parent.get(i));
                child.add(val);
                parent.add(child);
            }
        }

        return parent;

    }
}