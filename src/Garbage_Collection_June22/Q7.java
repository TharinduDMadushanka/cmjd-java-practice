package Garbage_Collection_June22;

/**
 * Case 05
 * reassign object
 */

class Q7{
    long[] ar = new long[100000];

    public void finalize(){
        System.out.println("Deleted....");
    }
}
class Example7 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        Q7 c1 = new Q7();
        // c1.
        // c1.
        // c1.

        c1 = new Q7(); // reassign object reference

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println("End Main");
    }
}
