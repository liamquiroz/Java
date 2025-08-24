public class ExplicitCasting {
    public static void main(String[] args) {
        double d = 10.99;
        float f = (float) d;   // double to float
        long l = (long) f;     // float to long
        int i = (int) l;       // long to int
        short s = (short) i;   // int to short
        byte b = (byte) s;     // short to byte

        System.out.println("Original double value: " + d);
        System.out.println("Converted to float: " + f);
        System.out.println("Converted to long: " + l);
        System.out.println("Converted to int: " + i);
        System.out.println("Converted to short: " + s);
        System.out.println("Converted to byte: " + b);
    }
}