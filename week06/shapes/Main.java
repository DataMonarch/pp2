public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(5, 10);
        Rectangle r3 = new Rectangle(10, 5);

        System.out.println("Rectangle r1: " + r1);
        System.out.println("Rectangle r2: " + r2);
        System.out.println("Rectangle r3: " + r3);

        System.out.println("r1 == r2? " + (r1 == r2));
        System.out.println("r1.equals(r2)? " + r1.equals(r2));
        System.out.println("r1.equals(r3)? " + r1.equals(r3));

        Square s1 = new Square(5);
        Square s2 = new Square(5);
        Square s3 = new Square(10);

        System.out.println("Square s1: " + s1);
        System.out.println("Square s2: " + s2);
        System.out.println("Square s3: " + s3);

        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1.equals(s2)? " + s1.equals(s2));
        System.out.println("s1.equals(s3)? " + s1.equals(s3));

        Rectangle r_org = new Rectangle(10, 20);
        Rectangle r_cpy = r_org.clone();
        System.out.println("Original Rectangle: " + r_org);
        System.out.println("Cloned Rectangle: " + r_cpy);
        System.out.println("r_org == r_cpy? " + (r_org == r_cpy));
        System.out.println("r_org.equals(r_cpy)? " + r_org.equals(r_cpy));
    }
}
