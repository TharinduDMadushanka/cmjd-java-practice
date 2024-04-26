package Day08;

// Q409 Exercise 1

public class Q24 {
    public static void main(String[] args) {
        int[] ar = {56,78,58,89,97,86,78,98,94,75,59,87,89,36,21};
        printArray(ar);
    }
    public static void printArray(int[] ar){
        System.out.print("[");
        for (int a : ar){
            System.out.print(a+", ");
        }
        System.out.println("\b\b]");
    }
}
