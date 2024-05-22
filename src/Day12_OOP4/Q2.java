// eX 01 Q554

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

    public void callPark(){
        park(); // call from Car
        super.park(); // call from Vehicle
    }
}

class Q2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.callPark();
    }
}
