package June22;

/**
 * case 03
 * gc runs some times
 */

class Q5{
    long[] ar = new long[100000];

    public void finalize(){
        System.out.println("Deleted....");
    }
}
class Example5 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        new Q5();
        new Q5();
        new Q5();

        System.gc(); // request for garbage collector

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println("End Main");
    }
}

