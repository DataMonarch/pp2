import java.util.Scanner;

public class Average {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while(sc.hasNextDouble()) {
            sum += sc.nextDouble();
            count++;
            // count = count + 1;
            // count += 1;
        }
        
        if (count == 0) {
            System.out.println("Error: No input entered");
        } else {
            double avg = sum / count;
            System.out.println("Average of the numbers inputted is: " + avg);
        }

    }

}
