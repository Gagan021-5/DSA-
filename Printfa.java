public class Printfa {

    public static void main(String[] args) {
        isFactor(18);
    }

    static void isFactor(int num) {
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}