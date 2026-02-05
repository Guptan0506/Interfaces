import java.util.ArrayList;

public class BigRectLister {
    //creates an ArrayList of 10 Rectangles making sure that you have several that are under and several that are over a perimeter of 10.
    // List the rectangles that have big perimeters

    ArrayList<Object> rectangles = new ArrayList<>();

    public BigRectLister() {
        rectangles.add(new java.awt.Rectangle(1, 1, 2, 2)); // perimeter 8
        rectangles.add(new java.awt.Rectangle(2, 2, 3, 3)); // perimeter 12
        rectangles.add(new java.awt.Rectangle(3, 3, 1, 1)); // perimeter 8
        rectangles.add(new java.awt.Rectangle(4, 4, 5, 5)); // perimeter 20
        rectangles.add(new java.awt.Rectangle(5, 5, 1, 2)); // perimeter 6
        rectangles.add(new java.awt.Rectangle(6, 6, 4, 4)); // perimeter 16
        rectangles.add(new java.awt.Rectangle(7, 7, 2, 3)); // perimeter 10
        rectangles.add(new java.awt.Rectangle(8, 8, 6, 6)); // perimeter 24
        rectangles.add(new java.awt.Rectangle(9, 9, 1, 1)); // perimeter 8
        rectangles.add(new java.awt.Rectangle(10, 10, 3, 4)); // perimeter 14

        BigRectangleFilter filter = new BigRectangleFilter();
        System.out.println("Rectangles with perimeter > 10:");
        for (Object rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println(rect);
            }
        }
    }

    public static void main(String[] args) {
        new BigRectLister();
    }

}
