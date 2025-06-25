public class sortarr {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,119};
        System.out.println(Sort(arr, 0));
    }


    public static boolean Sort(int[] arr,int start){
       if(start == arr.length-1){
        return true;
       }

       return arr[start]<arr[start+1] && Sort(arr, start+1);
    }
}
