package Day13_OOP5;

/**
 * We cant create interface obj type bt we can override interface class method nd access
 */
interface Vehicle{
    void park();
}

class Q17 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle() {
            public void park(){
                System.out.println("Car Parking");
            }
        };

        v1.park();
    }
}

