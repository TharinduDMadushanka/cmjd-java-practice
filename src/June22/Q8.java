package June22;

/**
 * Case 06
 * create object without referencing
 */

class Q8{
    long[] ar = new long[100000];

    public void finalize(){
        System.out.println("Deleted....");
    }

    public void myMethod(){
        System.out.println("myMethod()");
    }
}
class Example8 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        new Q8().myMethod();

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println("End Main");
    }
}

