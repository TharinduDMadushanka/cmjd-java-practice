package Day12_OOP4;

abstract class Vehicle{
    abstract public void park(); // Legal --> Abstract
}

class Car extends Vehicle{
    public void park(){
        System.out.println("Car Parking");
    }
}

class Bus extends Vehicle{
    public void park(){
        System.out.println("Bus Parking");
    }
}

class Van extends Vehicle{
    public void park(){
        System.out.println("Van Parking");
    }
}
class Q27 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bus(), new Van()};
        for (Vehicle vehicle : vehicles) {
            vehicle.park();
        }
    }
}

