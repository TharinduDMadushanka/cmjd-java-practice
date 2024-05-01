package Day09;

// search second max value in an  array

import java.util.Arrays;

class Q8 {
    public static void main(String[] args) {
        int ar[] = {32, 45, 68, 74, 59, 99, 14, 39, 24, 64, 92};
        System.out.println(Arrays.toString(ar)); // [32,45,68,74,59,99,14,39,24,64,92]
        printSecondMax(ar); // Second Max : 92

        int br[] = {32, 45, 68, 74, 59, 99, 14, 99, 24, 64, 92};
        System.out.println(Arrays.toString(ar)); // [32,45,68,74,59,99,14,99,24,64,92]
        printSecondMax(br); // Second Max : 92

        int cr[] = {90, 90, 90, 90, 90};
        System.out.println(Arrays.toString(ar)); // [90, 90, 90, 90, 90]
        printSecondMax(cr); // There is no second max in this array
    }

    public static void printSecondMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        int secondMax = max;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                secondMax = max;
                max = ar[i];
            } else if (ar[i] > secondMax && ar[i] != max) {
                secondMax = ar[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second max in this array");
        } else {
            System.out.println("Second Max : " + secondMax);
        }

    }

}