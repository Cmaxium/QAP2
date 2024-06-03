// TestMyLine.java
public class TestMyLine {
    public static void main(String[] args) {
        // Create MyPoint objects
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(3, 4);

        // Create MyLine object using MyPoint objects
        MyLine line1 = new MyLine(p1, p2);

        // Create MyLine object using coordinates
        MyLine line2 = new MyLine(5, 6, 7, 8);

        // Test getters and setters
        System.out.println("Line1: " + line1);
        System.out.println("Line2: " + line2);

        line1.setBeginX(10);
        line1.setEndY(20);
        System.out.println("After modification Line1: " + line1);

        // Test length and gradient methods
        System.out.println("Length of Line1: " + line1.getLength());
        System.out.println("Gradient of Line1: " + line1.getGradient());

        System.out.println("Length of Line2: " + line2.getLength());
        System.out.println("Gradient of Line2: " + line2.getGradient());
    }
}
