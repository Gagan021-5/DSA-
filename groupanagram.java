import java.util.*;

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.

// Example 1:
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:
// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

public class groupanagram {
    public static void main(String[] args) {

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String str = new String(word);

            if(!hmap.containsKey(str)){
                hmap.put(word,new ArrayList<>());
            }
            //if i get then add word corresponding value pairs 
            hmap.get(str).add(word);
             
        }
        //return all the values of that unique key 
        return new ArrayList<>(hmap.values());

    }
}
