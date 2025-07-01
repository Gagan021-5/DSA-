import java.util.ArrayList;

public class dicethrow {

    public static void main(String[] args) {
       System.out.println(dicecomb("", 4));;
    }

    // static void dicecomb(String s, int target) {
    //     if (target == 0) {
    //         System.out.println(s);
    //         return;
    //     }
    //     for (int i = 1; i <= 6 && i <= target; i++) {
    //         dicecomb(s + i, target - i);
    //     }
    // }

    static ArrayList<String> dicecomb(String s, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dicecomb(s + i, target - i));
        }
        return list;
    }
}
