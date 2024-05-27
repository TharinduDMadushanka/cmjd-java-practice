package Day13_OOP5;

/**
 * Case 5
 */
interface Vehicle{
    boolean park();
}

class Example {
    public static void main(String[] args) {
        Vehicle v1 = ()-> true;

        //Vehicle v2 = ()-> return true; // Illegal

        Vehicle v2 = ()-> {
            //Multiple lines
            //
            return true;
        };
    }
}
