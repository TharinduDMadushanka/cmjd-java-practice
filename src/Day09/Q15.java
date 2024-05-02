package Day09;

/**
 * Using Static Variable [Global Variable], Template Variable
 */

public class Q15 {
    public static int globalVariable = 100; // can access anywhere in class ---> global

    public static void main(String[] args) {
        int localVariable = 200; // only access in the method--->local
        System.out.println("Local : " + localVariable);
        System.out.println("Global : " + globalVariable);
    }

}
