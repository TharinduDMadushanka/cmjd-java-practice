package Day12_OOP4;

final class Vehicle{
    public void park(){
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle{
    public void park(){  // Illegal--> cant extends
        System.out.println("Car Parking");
    }
}
