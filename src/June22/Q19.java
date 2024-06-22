package June22;

/**
 * ENUMERATION
 * we can do same thing with enum instead of final
 * call constructor for all objects
 */

// class Color{
//     public static final String RED = "Red";
//     public static final String GREEN = "Green";
//     public static final String BLUE = "Blue";
//     public static final String BLACK = "Black";
// }

enum Color1{
    RED, GREEN, BLACK, BLUE;// Enum ObjectsS
}

class Example19 {
    public static void main(String args[]) {
        System.out.println(Color.RED);

        Color1 c1; // Create an enum reference type 'Color'
        c1 = Color1.RED;
        System.out.println(c1); // c1.toString() --> RED
    }
}

