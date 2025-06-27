import java.util.ArrayList;
import java.util.List;

public class permutleetcode {
    

    public static void main(String[] args) {
        
    }

    
    static List<List<Integer>> permute(int[] nums) {
         int[] p = new int[nums.length];
         int[] up = new int[nums.length];

         for (int i = 0; i <= p.length; i++) {
             if(up.length ==0){
                return new ArrayList<>(p[i]);
             }
             int a = up[0];
            int first = p.(0, i);
            int  second = p.substring(i, p.length());
            permutsubset(first + ch + second, up.substring(1));
        }
        

}
}
