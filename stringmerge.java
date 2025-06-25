import java.util.Arrays;

public class stringmerge {

    // Example 1:

    // Input: w1 = "abc", w2 = "pqr"
    // Output: "apbqcr"
    // Explanation: The merged string will be merged as so:
    // word1: a b c
    // word2: p q r
    // merged: a p b q c r

    public static void main(String[] args) {
        String res = merger("abc", "pqr");
        System.out.println(res);
    }

    static String merger(String w1, String w2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < w1.length() && j < w2.length()) {
            if (i < w1.length()) {
                str.append(w1.charAt(i++));

            }
            if (j < w2.length()) {
                str.append(w2.charAt(j++));
               

            }
        }
        return str.toString();

    }
}
