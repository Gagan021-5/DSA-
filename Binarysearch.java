public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 34, 56, 78, 134 };
        int ans = BS(arr, 0, 134, arr.length-1);
        System.out.println("Target element would be in : "+ ans);

    }

    public static int BS(int[] arr, int s, int target, int e) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
             if(arr[mid] == target){
                return mid;
             }else if(arr[mid] < target){
                s = mid  + 1;
             }else{
                 e = mid -1;
             }

         
        }

        return -1;
    }
}
