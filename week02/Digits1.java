import java.util.Scanner;

public class Digits1 {
    public static void main(String[] args) {
        //Given an integer (can be negative as well). Find the sum, product, and average of its number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        int sum = 0;
        int product = 1;
        int count = 0;
        int copy = num;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            count++;
            num /= 10;       
        }

        System.out.println("Sum of the digits of" + copy +" : " + sum);
        System.out.println("Product of the digits of" + copy +" : " + product);
        System.out.println("Average of the digits of" + copy +" : " + (float) sum / count );
        // System.out.println("Average of the digits of" + copy +" : " + sum * 1.0f / count );
    }
}
