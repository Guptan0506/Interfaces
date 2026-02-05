public class BigRectangleFilter {
    //implements the Filter interface whose accept method accepts all java Rectangle objects that have a perimeter > 10.
    public boolean accept(Object x) {
        java.awt.Rectangle rect = (java.awt.Rectangle) x;

        int perimeter = 2 * (rect.width + rect.height);
        if (perimeter > 10) {
            return true;
        } else {
            return false;
        }
    }
}
