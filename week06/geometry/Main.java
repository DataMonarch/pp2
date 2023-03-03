import java.util.Scanner;

// package week03.geometry;

public class Main {
    
    public static void main(String[] args) {
        float x = 2.0f;
        float y = 7.0f;

        Point p1 = new Point(2.0f, 3.0f);
        Point p2 = new Point(x, y);

        System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Are Point 1 and Point 2 equal? " + p1.equals(p2));
        p1.translate(1.0f, 1.0f);
        System.out.println("Translated Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));
        System.out.println("Are Point 1 and Point 2 equal after p1 was translated? " + p1.equals(p2));

        // System.out.print("Enter new coordinates for the Point 1: ");
        // Scanner sc = new Scanner(System.in);
        // float new_x = sc.nextFloat();
        // float new_y = sc.nextFloat();

        // p1.setX(new_x);
        // p1.setY(new_y);
        // System.out.println("Point 1 after resetting: (" + p1.getX() + ", " + p1.getY() + ")");

          // Test the Segment class
          Segment s1 = new Segment(p1, p2);
          Segment s2 = new Segment(1.0f, 2.0f, 3.0f, 4.0f);
  
          System.out.println("Segment 1: " + s1);
          System.out.println("Segment 2: " + s2);
  
  
          s1.translate(1.0f, 1.0f);
          System.out.println("Translated Segment 1: " + s1);
              
          System.out.println("Length of Segment 1: " + s1.length());
          System.out.println("Are Segment 1 and Segment 2 equal? " + s1.equals(s2));
          System.out.println("Slope of Segment 1: " + s1.getSlope());
          System.out.println("Intercept of Segment 1: " + s1.getIntercept());
          
          Point p3 = new Point(2.0f, 3.0f);
          
          System.out.println("Is Point 3 on the line of Segment 1? " + s1.isOnLine(p3));
          System.out.println("Is Point 3 on Segment 1? " + s1.isOnSegment(p3));

          System.out.println("Point 1: " + p1.toString());
          System.out.println("Point 2: " + p2);

    }

}
