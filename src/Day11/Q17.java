///**
// * METHOD OVERRIDING -> same method in super & sub class
// */
//package Day11;
//
//class Vehicle{
//    public void park(){
//        System.out.println("Vehicle Parking");
//    }
//}
//
//class Car extends Vehicle{
//    public void park(){ // Same name. Same Parameter List -> Method Overriding
//        System.out.println("Car Parking");
//    }
//
//    public void park(int location){ // Same name. Different Parameter List -> Method Overloading
//        System.out.println("Car Parking : " + location);
//    }
//}
//
//class Q17 {
//    public static void main(String[] args) {
//        Car car = new Car();
//        car.park();
//        car.park(10);
//    }
//}
//
