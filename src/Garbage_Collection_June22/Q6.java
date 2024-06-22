package Garbage_Collection_June22;

/**
 * case 04
 * USE NULL REFERENCES
 */

class Q6{
    long[] ar = new long[100000];

    public void finalize(){
        System.out.println("Deleted....");
    }
}
class Example6 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        Q6 c1 = new Q6();
        // c1.
        // c1.
        // c1.

        c1 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println("End Main");
    }
}

