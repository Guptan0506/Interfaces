public class ShortWordFilter implements Filter {
    //accept method accepts all strings of length < 5
    @Override
    public boolean accept(Object x) {
        String s = (String) x;

        return (s.length() < 5);
    }
}
