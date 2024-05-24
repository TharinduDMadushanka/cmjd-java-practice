package Day12_OOP4;
/**
 * Case 5
 * cann declare objects from abs class
 */
abstract class Vehicle{
    abstract public void park();
}

class Example {
    public static void main(String[] args) {
        Vehicle v1; // Legal
        v1 = new Vehicle(); // Illegal
    }
}
