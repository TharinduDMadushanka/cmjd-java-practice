package Day12_OOP4;
/**
 * Case 9
 * cant declare abstract attributes
 */
abstract class Vehicle{
    int year;
    abstract String model; // Illegal
    abstract public void park();
}
