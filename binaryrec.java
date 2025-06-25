public class binaryrec {
    public static void main(String[] args) {
        int[] arr =  {5,8,9,11,13,15};
        int ans  = BinarySearch(arr, 0, arr.length-1, 11);
        System.out.println("Answer is "+ ans);
    }

    static int BinarySearch(int arr[],int s,int e,int target){
      if(s>e){
        return -1;
      }
      int m = s + (e-s)/2;
      if(arr[m]==target){
        return m;
      }else if(arr[m]<target){
       return   BinarySearch(arr, m+1, e, target);
      } 
        return BinarySearch(arr, s, m-1, target);
      
    }
}
