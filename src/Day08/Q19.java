package Day08;

import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {

        int[] ar = {10, 20, 30, 40};
        System.out.println(Arrays.toString(ar));

        for (int i = 0; i < ar.length; i++) {
            ar[i]++;
        }
        System.out.println(Arrays.toString(ar)); //---> [11, 21, 31, 41]

        for (int a : ar) { // In here passing only the value of the ar not the element
            a++;
            System.out.print(a + " ");//---> 12 22 32 42
        }
        System.out.println();
        System.out.println(Arrays.toString(ar));//---> [11, 21, 31, 41] not change the original array values in for-each loop
    }
}
