package Day09;

import java.util.Arrays;

class Q19 {
    public static int[] ar = {100, 200, 300, 400, 500};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ar)); //[100, 200, 300, 400, 500]
        increment();
        System.out.println(Arrays.toString(ar)); //[101, 201, 301, 401, 501]
    }

    public static void increment() {
        for (int i = 0; i < ar.length; i++) { // dont need any return because ar is a static
            ar[i]++;
        }
    }

}
