/**
 * Method Overriding Rules
 */

package Day12_OOP4;
class Vehicle{
    public void park(){
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle{
    public void park(){
        System.out.println("Car Parking");
    }
}


class Q19 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
