public class SumDemo1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        long b = Long.parseLong(args[1]);

        float sum = a + b;
        
        System.out.println(a+"+"+b+"="+sum);
        System.out.printf("sum: %f \n", sum);
    }
}
