public class setBits {

    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    static int setBits(int num) {
       int cnt = 0;
       while(num>0){ 
        cnt++;
        num = num & (num-1);

       }
       return cnt;
    }
}
