import java.util.ArrayList;
import java.util.List;

public class lettercomb {

    public static void main(String[] args) {

    }

    // static void keypad(String p, String up) {
    // if (up.isEmpty()) {
    // System.out.println(p);
    // return;
    // }

    // int val = up.charAt(0) - '0'; // '2'-> 2
    // for (int i = (val - 1) * 3; i < val * 3; i++) {
    // char ch = (char) ('a' + i);
    // keypad(p + ch, up.substring(1));
    // }
    // }

    public List<String> letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            List<String> newlist = new ArrayList<>();
            newlist.add(p);
            return newlist;
        }
        int val = up.charAt(0) - '0'; // '2'--> 2 (int)
        List<String> newlist = new ArrayList<>();
        for (int i = (val - 1) * 3; i < (val * 3); i++) {
            char ch = (char) ('a' + i);

            newlist.addAll(letterCombinations(p + ch, up.substring(1)));
        }
        return newlist;
    }

}
