public class googlesubssq {

    public static void main(String[] args) {
        String[] arr = { "a", "bb", "acd", "ace" };
    }

    static void checksubsq(String s, String words) {
        String p = "";
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = s.charAt(0);
        checksubsq(s + c, words);
        s.substring(1);
    }
}
