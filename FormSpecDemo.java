public class FormSpecDemo {
    
    public static void main(String[] args) {
        int a = 5;
        // print the value of a in int, hex, octal and binary
        System.out.printf("a = %d, 0x%x, 0%o, 0b%s\n", a, a, a, Integer.toBinaryString(a));
        
        float b = 555.5f;
        //decimal floating-point, scientific notation
        System.out.printf("b = %f, %e", b, b);
    }

}
