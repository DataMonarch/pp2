import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output_seq = "";

        for(int i = 0; i < input.length(); i++) {
            if(!Character.isDigit(input.charAt(i)) && input.charAt(i) != '.' && (input.charAt(i) != '-' && i != 0)) {
                throw new IllegalArgumentException("Invalid input: " + input + " is not a number");
            }
            else {
                output_seq += input.charAt(i);
            }
        }

        Float output = Float.parseFloat(output_seq);
        System.out.println(output);
        
        // int intValue = Integer.parseInt(intString);
        // System.out.println(intValue); // prints "123"

        // String floatString = "3.14";
        // float floatValue = Float.parseFloat(floatString);
        // System.out.println(floatValue); // prints "3.14"
    }
}
