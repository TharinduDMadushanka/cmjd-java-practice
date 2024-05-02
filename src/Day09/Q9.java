package Day09;

// Q433 Exercise 12
// check 2 arrays are duplicate

import java.util.Arrays;

class Q9 {

    public static void main(String[] args) {
        int[] ar = {32, 45, 68, 74, 59, 99, 14, 39, 24, 64, 92};
        System.out.println(Arrays.toString(ar)); // [32,45,68,74,59,99,14,39,24,64,92]
        System.out.println("Array ar is a duplicate array : " + isDuplicate(ar)); // false

        int[] br = {32, 45, 68, 74, 59, 99, 14, 39, 24, 99, 92};
        System.out.println(Arrays.toString(br)); // [32,45,68,74,59,99,14,39,24,99,92]
        System.out.println("Array br is a duplicate array : " + isDuplicate(br)); // true
    }

    public static boolean isDuplicate(int[] ar) {


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

