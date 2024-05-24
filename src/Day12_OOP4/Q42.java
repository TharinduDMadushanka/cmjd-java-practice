package Day12_OOP4;

interface Vehicle2{
    public void park();
}
//class Car extends Vehicle{
class Car2 implements Vehicle2{
    public void park() {
        System.out.println("Car Parking");
    }
}

class Q42 {
    public static void main(String[] args) {
        Vehicle2 v1= new Car2();
        v1.park();
    }
}
