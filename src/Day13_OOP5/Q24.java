package Day13_OOP5;
/**
 * Case 3
 * There should me ";" after the code block
 */
interface Vehicle{
    void park();
}

class Example {
    public static void main(String[] args) {
        Vehicle v1 = () -> {
            System.out.println("Car parking... Lambda 1");
            System.out.println("Car parking... Lambda 2");
        } //; // Illegal
        v1.park();
    }
}
