/**
 * Case 02
 */

package Day12_OOP4;
class Vehicle{
    public static void park(){
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle{
    public void park(){ // Illegal--> cant declare super class static methods
        System.out.println("Car Parking");
    }
}


class Q21 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
