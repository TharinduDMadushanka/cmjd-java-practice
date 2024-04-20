// Find total of a array

package Day08;

import java.util.Random;

class Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ar = new int[10];

        for(int i =0; i < 10; i++){
            ar[i] = random.nextInt(101);
        }

        // Find total
        int total = 0;
        System.out.print("[");
        for(int i = 0; i< 10; i++){
            System.out.print(ar[i] + ", ");
            total+=ar[i];

        }
        System.out.println("\b\b]");

        System.out.println("Total : " + total);
    }
}



