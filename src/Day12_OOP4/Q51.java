package Day12_OOP4;
/**
 * Case 09
 * cant re asssing abs attributes values
 */
interface Vehicle{
    int year = 2000; // implicitly public, static, final
    void park();
}

class Example {
    public static void main(String[] args) {
        System.out.println(Vehicle.year);
        Vehicle.year = 2001; // Illegal
    }
}
