package Day09;

// OOP lecture 03 27/04/2024
// copy values in array
// Exercise 5

import java.util.Arrays;

class Q1 {

    public static void main(String[] args) {
        int[] ar = {100, 200, 300, 400, 500, 600};
        int[] br = new int[ar.length];

        System.out.println(Arrays.toString(ar)); // [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(br)); // [0, 0, 0, 0, 0, 0]

        copyValueFromTo(ar, br);

        System.out.println(Arrays.toString(ar)); // [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(br)); // [100, 200, 300, 400, 500, 600]
        System.out.println(ar == br); // false
    }

    public static void copyValueFromTo(int[] from, int[] to){


        for (int i=0;i<from.length;i++){ // copying values
            to[i]=from[i];
        }


    }
}
