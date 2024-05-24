package Day12_OOP4;

/**
 * Case 10
 * we can do run time polymorphism with interfaces
 */
interface Vehicle{
    void park();
}

class Car implements Vehicle{
    public void park(){
        System.out.println("Car Parking");
    }
}

class Bus implements Vehicle{
    public void park(){
        System.out.println("Bus Parking");
    }
}

class Van implements Vehicle{
    public void park(){
        System.out.println("Van Parking");
    }
}
class Example {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bus(), new Van()};
        for (Vehicle vehicle : vehicles) {
            vehicle.park();
        }
    }
}
