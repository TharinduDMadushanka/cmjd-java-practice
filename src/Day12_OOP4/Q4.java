package Day12_OOP4;

class Vehicle{
    int year = 2000;
    public void park(){
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle{
    int year = 2005;
    public void park(){
        System.out.println("Car Parking");
    }

    public void mC(){
        int year = 2010;
        System.out.println("Local : " + year); // 2010
        System.out.println("Car : " + this.year); // 2005
        System.out.println("Vehicle : " + super.year); //2000
    }
}

class Q4 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.mC();
    }
}
