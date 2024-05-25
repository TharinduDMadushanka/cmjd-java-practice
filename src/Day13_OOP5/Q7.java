package Day13_OOP5;

/**
 * Case 16
 * we can declare static methods in the interfaces
 */
interface Vehicle{
    public void park();

    default public void start(){ // Legal, since JDK 1.8
        System.out.println("Vehicle Start");
    }

    public static void stop(){
        System.out.println("Vehicle Stop");
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
        Vehicle.stop();
    }
}

