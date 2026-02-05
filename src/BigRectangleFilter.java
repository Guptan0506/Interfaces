public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        java.awt.Rectangle rect = (java.awt.Rectangle) x;

        int perimeter = 2 * (rect.width + rect.height);
        return perimeter > 10;
    }
}
