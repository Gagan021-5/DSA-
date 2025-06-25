

public class largestperi {

    public static void checkage(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("You are below 18");
        } else {
            System.out.println("You are good to vote!");
        }

    }

    public static void main(String[] args) {
        try {
            checkage(9);
        } catch (ArithmeticException e) {
            System.out.println("An expection is caught!\n" + e);
        } finally {
            System.out.println("I will run either there is any exception occur or not!");
        }

    }

}
