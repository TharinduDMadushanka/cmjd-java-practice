package Basics;

//Conversion and casting
public class Q4 {
    public static void main(String[] args) {
        int x = 100;
        short s = 100;
        long y = 100;
        float f = 100.0f;
        double d = 100.0;

        //s = x; // Illegal
        //x = y; // Illegal
        //y = f; // Illegal
        //f = d; // Illegal

        d = s;
        d = y;
        d = x;
        d = f;

        f = s;
        f = x;
        f = y;

        y = s;
        y = x;

        x = s;

    }
}

