import java.util.Scanner;

public class Digits {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int n = scanner.nextInt();
        n = Math.abs(n);
        
        int sum = 0;
        int product = 1;
        int count = 0;
        int copy = n;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            count++;
            n /= 10;
        }

        double avg = (double) sum / count;
        System.out.println("Sum of digits in " + copy + ": " + sum);
        System.out.println("Product of digits in " + copy + ": " + product);
        System.out.println("Average of digits in " + copy + ": " + avg);

    }

}
