public class Visaq1 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int pivot = 7;
        System.out.println(compareelement(arr, pivot));     
    }

    public static String compareelement(int[] arr, int pivot) {
        int cntgreater = 0; 
        int cntless = 0; 
        int i = 0; 
        while (i < arr.length) {
            if (arr[i] > pivot) { 
                cntgreater++;
            } else if (arr[i] < pivot) {
                cntless++; 
            } 
            i++;
        }

        if (cntgreater == cntless)
            return "tie"; 
 
        String ans = (cntgreater > cntless) ? "greater" : "lesser";



        return ans;

    }

    // Q1 an array given with a pivot and we had to return a string such that if
    // elements in array that are strictly greater than pivot are more then return
    // "greater", else if elements strictly lesser than pivot are more return
    // "shorter" else if equal return "tie";

}
