import java.util.*;

public class longestsubstringwithoutrepeatingchar {
    // Given a string s, find the length of the longest substring without duplicate
    // characters.

    // Example 1:

    // Input: s = "abcabcbb"
    // Output: 3
    // Explanation: The answer is "abc", with the length of 3. Note that "bca" and
    // "cab" are also correct answers.
    public static void main(String[] args) {
    String s = "abcabcbb";
    int ans = lengthOfLongestSubstring(s);
    System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> cset = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!cset.contains(s.charAt(right))) {
                cset.add(s.charAt(right));
                maxlength = Math.max(maxlength,right - left + 1);
            } else {
           
                cset.remove(s.charAt(left));
                left++;
        
            }
            cset.add(s.charAt(right));

        }
        return maxlength;
    }

}
