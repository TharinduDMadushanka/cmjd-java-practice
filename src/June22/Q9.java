package June22;

/**
 * CASE 07
 * Use code blocks (local scope)
 */

class Q9{
    long[] ar = new long[100000];

    public void finalize(){
        System.out.println("Deleted....");
    }

    public void myMethod(){
        System.out.println("myMethod()");
    }
}
class Example9 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        int x = 100;
        if(x > 0){
            Q9 c1 = new Q9();
            c1.myMethod();
        }

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {}

        System.out.println("End Main");
    }
}
