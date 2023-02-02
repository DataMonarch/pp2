public class Sum {
    // add two numbers
    public static void main(String[] args) {
        // convert the 0th and 1st argument to int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("Sum of "+ a +" and " + b + " is : " + sum);
    }
}
