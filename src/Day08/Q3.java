// Find min and max elements in a array

package Day08;

import java.util.Random;

class Q3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ar = new int[10];

        for(int i =0; i < 10; i++){
            ar[i] = random.nextInt(101);
        }

        // Find total
        int total = 0;
        int max=0;
        int min=ar[0];

        System.out.print("[");
        for(int i = 0; i< 10; i++){
            System.out.print(ar[i] + ", ");
            total+=ar[i];

            if (max<ar[i]){ // find max value
                max=ar[i];
            }

            if (ar[i]<min){ // find min value
                min=ar[i];
            }
        }
        System.out.println("\b\b]");

        System.out.println("Total : " + total);
        System.out.println("Max :"+ max);
        System.out.println("Min :"+min);
    }
}

