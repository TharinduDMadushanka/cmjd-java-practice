package Day13_OOP5;

/**
 * Case 6
 * there are more than one methods to implement we cant use lambda expression
 * Functional Interface --> only one methods to implement
 * Lambda use for functional expression
 */
interface Vehicle{
    void park();
    void start();
}

class Example {
    public static void main(String[] args) {
        Vehicle v1= ()->{ // Illegal

        };
    }
}
