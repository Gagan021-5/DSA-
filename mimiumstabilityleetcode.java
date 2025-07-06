import java.util.Arrays;

public class mimiumstabilityleetcode {
    
    public int minStable(int[] nums, int maxC) {
        int n = nums.length-1;
        int mid = nums.length/2;
        boolean ishcf = false;

        int hcf = nums[0];
        
            public int hcfnumbers(int a ,int b){
                        int temp = b;
                        b = a % b;
                        a = temp;
                        return a;
            }

        for(int i=0;i<=n;i++){
            hcf = hcfnumbers(hcf,nums[i]);
            if(hcf <2){
                return 1;
                break;
            }
            ishcf = true;
        }
            
         int[] leftmost = Arrays.copyofRange(0,mid);
         int[] rightmost = Arrays.copyofRange(mid+1,n);
         
        
            for(int i=0;i<leftmost.length;i++){
              if(ishcf){
            
              }
            }
        
            
            
    }
}
