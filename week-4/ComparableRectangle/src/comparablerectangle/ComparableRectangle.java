package comparablerectangle;

public class ComparableRectangle {

    public static void main(String[] args) {
        Rectangle rectangle1;
        rectangle1 = new Rectangle(3, 5, "Yellow", true);
        Rectangle rectangle2 = new Rectangle(5, 3, "Orange", true);
        
        // Compare the two rectangles to make sure the methods work.
        if (rectangle1.equals(rectangle2)) {
            System.out.println("These rectangles are equal.");
        } // if
        else {
            System.out.println("These rectangles are unequal.");
        }
    } // + void main
} // + class ComparableRectangle
