public class linearec {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8};
        int ans = linear(arr, 7, 0);
        System.out.println(ans);


    }
    static int  linear(int[] arr,int target,int index){
    if(index== arr.length ){
        return -1;
    }
    
    if(arr[index]==target){
        return index;
    } 
        return linear(arr, target, index+1);
        
}
    }

