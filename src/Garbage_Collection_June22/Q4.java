package Garbage_Collection_June22;

class Q4{
    long[] ar = new long[100000];

    public void finalize(){
        System.out.println("Deleted....");
    }
}
class Example4 {
    public static void main(String args[]) {
        System.out.println("Start Main");


        new Q4();
        new Q4();
        new Q4();

        try {
            Thread.sleep(1000); // hold program 1000 millisecond without run
        } catch (Exception e) {}

        System.out.println("End Main");
    }
}

