// Given a string s which may contain lowercase and uppercase characters. 
//The task is to remove all duplicate characters from the string and find the resultant string. 
//The order of remaining characters in the output should be same as in the original string.

// Example 1:

// Input: s = "geEksforGEeks"
// Output: "geEksforG"
// Explanation: After removing duplicate characters such as E, e, k, s, we have string as "geEksforG".

import java.util.*;

public class removeduplicatestring {
    public static void main(String[] args) {

    }

    public static String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder();
        HashSet<Character> hset = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!hset.contains(c)) {
                hset.add(c);
                str.append(c);
            }

        }

        return str.toString();

    }

}
