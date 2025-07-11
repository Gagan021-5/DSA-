public class powxnbit {
    


    public static int main(String[] args) {
        int base = 3;
        int power = 6;
        int ans = 1;
        while(power>0){
            if((power&1) ==1){
                ans = ans * base;
            }
            base *=base;
            power = power>>1;
        }
        return ans;
    }
}
