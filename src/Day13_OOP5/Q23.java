package Day13_OOP5;
/**
 * Case 2
 * there are more than 1 statements there should be code block and ";"
 */
interface Vehicle{
    void park();
}

class Example {
    public static void main(String[] args) {
        Vehicle v1 = () -> {
            System.out.println("Car parking... Lambda 1");
            System.out.println("Car parking... Lambda 2");
        };
        v1.park();
    }
}
