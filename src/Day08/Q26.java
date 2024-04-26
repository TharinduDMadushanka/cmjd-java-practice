package Day08;

// Exercise 3--> Reverse array

public class Q26 {
    public static void main(String[] args) {
        int[] ar = {56,78,58,89,97,86,78,98,94,75,59,87,89,36,21};
        printReverse(ar);
    }
    public static void printReverse(int[] ar){
        System.out.print("[");
        for (int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i]+", ");
        }
        System.out.println("\b\b]");
    }
}
