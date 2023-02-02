import java.util.Scanner;

public class Harmonic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double sum = 1.0;

        if (n <= 0) {
            System.out.println("The element number should be a positive integer!");
        } else {
            for (int i=2; i <= n; i++) {
                sum += 1.0 / i;
            }
            
            System.out.println(n + "th element of the harmonic series is: " + sum);
        }
    }

}
