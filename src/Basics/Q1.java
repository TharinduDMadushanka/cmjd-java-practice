package Basics;

//Get min and max values of data types
public class Q1 {
    public static void main(String[] args) {
        byte b;
        b = Byte.MAX_VALUE;
        System.out.println(b); //127
        b = Byte.MIN_VALUE;
        System.out.println(b); //-128

        short s;
        s = Short.MAX_VALUE;
        System.out.println(s); //32767
        s = Short.MIN_VALUE;
        System.out.println(s); //-32768

        int i;
        i = Integer.MAX_VALUE;
        System.out.println(i); //2147483647
        i = Integer.MIN_VALUE;
        System.out.println(i); //-2147483648

        long l;
        l = Long.MAX_VALUE;
        System.out.println(l); //9223372036854775807
        l = Long.MIN_VALUE;
        System.out.println(l); //-9223372036854775808

    }
}

