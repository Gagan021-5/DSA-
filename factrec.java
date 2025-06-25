public class factrec {
    public static void main(String[] args) {
        int val = Factorial(5);
        System.out.println(val);
    } 

    static int Factorial(int num){
        if(num ==0){
           return 1;
        }
        return num * Factorial(num-1);
        
    } 
}
