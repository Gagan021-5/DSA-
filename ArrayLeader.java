import java.util.*;
// You are given an array arr of positive integers. 
//Your task is to find all the leaders in the array.
// An element is considered a leader if it is greater than or equal to all elements to its right.
// The rightmost element is always a leader.

// Examples:

// Input: arr = [16, 17, 4, 3, 5, 2]
// Output: [17, 5, 2]
// Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
public class ArrayLeader {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        System.out.println(leaders(arr));
    }

    public static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int last = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i] && i > 0) {
                list.add(arr[i - 1] + arr[last]);
            }

        }

        return list;
    }

}
