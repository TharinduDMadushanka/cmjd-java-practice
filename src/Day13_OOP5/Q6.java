package Day13_OOP5;

/**
 * Case 15
 * we can declare default method in the interfaces since jdk 1.8
 */
interface Vehicle{
    public void park();

    default public void start(){ // Legal, since JDK 1.8
        System.out.println("Vehicle Start");
    }
}

class Car implements Vehicle{
    public void park() {
        System.out.println("Car Parking");
    }
}

class Example {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
        v1.start();
    }
}
