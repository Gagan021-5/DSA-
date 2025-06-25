public class srec {
    
    public static void main(String[] args){
     System.out.println(fibo(13));  //base condition 
    }
    static int fibo(int num){
        if(num<2){
            return num;
        }
     return fibo(num-1) + fibo(num-2);
    }
}
