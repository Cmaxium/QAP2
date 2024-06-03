// TestMyRectangle.java
public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyPoint objects
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(5, 1);

        // Create MyRectangle object using MyPointR objects
        MyRectangle rect1 = new MyRectangle(p1, p2);

        // Create MyRectangle object using coordinates
        MyRectangle rect2 = new MyRectangle(2, 6, 8, 2);

        // Test getters and setters
        System.out.println("Rectangle1: " + rect1);
        System.out.println("Rectangle2: " + rect2);

        rect1.setTopLeft(new MyPoint(0, 7));
        rect1.setBottomRight(new MyPoint(4, 3));
        System.out.println("After modification Rectangle1: " + rect1);

        // Test width, height, area, and perimeter methods
        System.out.println("Width of Rectangle1: " + rect1.getWidth());
        System.out.println("Height of Rectangle1: " + rect1.getHeight());
        System.out.println("Area of Rectangle1: " + rect1.getArea());
        System.out.println("Perimeter of Rectangle1: " + rect1.getPerimeter());

        System.out.println("Width of Rectangle2: " + rect2.getWidth());
        System.out.println("Height of Rectangle2: " + rect2.getHeight());
        System.out.println("Area of Rectangle2: " + rect2.getArea());
        System.out.println("Perimeter of Rectangle2: " + rect2.getPerimeter());
    }
}
