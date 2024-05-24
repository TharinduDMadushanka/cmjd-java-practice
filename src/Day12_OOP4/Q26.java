/**
 * Abstract Classes and Abstract Methods
 */

package Day12_OOP4;
class Vehicle{
    public void park(); // Illegal--> without body method
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
class Example {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bus(), new Van()};
        for (Vehicle vehicle : vehicles) {
            vehicle.park();
        }
    }
}

