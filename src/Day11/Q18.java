/**
 * Case 9 (Dynamic Method Dispatch)
 * Vehicle v1 = new Car();
 * v1.park(); --> in here compiler chang object vehicle to car.
 */

package Day11;

class Vehicle {
    public void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

class Q18 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}

