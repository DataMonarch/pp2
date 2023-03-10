import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        
        int result = factorial(n);
        System.out.println(n + "! = " + result);
        
        // try {
        //     int result = factorial(n);
        //     System.out.println(n + "! = " + result);
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }
    }

    public static int factorial(int n) 
    throws  IllegalArgumentException {

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
