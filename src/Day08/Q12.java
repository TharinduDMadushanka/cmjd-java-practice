// Passing an array to a Method
package Day08;

public class Q12 {
    public static void main(String[] args) {
        int[] marks = {67, 35, 67, 89, 78, 69, 85, 67, 80, 45, 77, 80, 90, 91, 34, 56};
        printArray(marks);
    }

    public static void printArray(int[] ar) {// create int [] for catch passing marks array
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");

    }
}
