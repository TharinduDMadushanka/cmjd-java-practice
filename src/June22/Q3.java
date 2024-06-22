package June22;

/**
 * Case 01
 * finalize() method
 */

class Q3{
    long[] ar = new long[100000];

    public void finalize(){ //  called by the garbage collector before an object is garbage collected
        System.out.println("Deleted....");
    }
}
class Example3 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        for(int i = 0; i < 100000; i++){
            System.out.println("i : " + i);
            new Q3();
        }

        System.out.println("End Main");
    }
}
