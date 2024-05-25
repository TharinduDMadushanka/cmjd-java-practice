/**
 * Lambda Expression
 * (Since JDK 1.8)
 */
package Day13_OOP5;
interface Vehicle{
    void park();
}

class Example {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(){
            public void park() {
                System.out.println("Car Parking");
            }
        };

        v1.park();

        Vehicle v2 = () -> {
            System.out.println("Car Parking... Lambda Expression");
        };
        v2.park();
    }
}

