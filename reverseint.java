public class reverseint {
     //num = 123
     //output = 321

    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }

    static int reverse(int x) {
        int ans = 0;
        int rem = 0;
   
        while(x!=0){
            rem = x %10;
            if(ans <Integer.MIN_VALUE /10 || ans > Integer.MAX_VALUE/10) return 0;
            ans = ans *10 + rem;
            x/=10;

        }
        return ans;
    }
}
