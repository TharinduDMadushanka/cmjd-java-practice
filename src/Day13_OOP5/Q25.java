package Day13_OOP5;

/**
 * Case 4
 * x --> location , no need to re passing again
 */
interface Vehicle{
    void park(int location);
}

class Example {
    public static void main(String[] args) {
        Vehicle v1 = (x) -> {
            System.out.println("Car parking..." + x);
        };
        v1.park(1000);

        Vehicle v2 = (int location) -> {
            System.out.println("Car parking..." + location);
        };

        v2.park(100);
    }
}
