package Day09;

// Q441 Exercise 16
// add an elements to end of an array

import java.util.Arrays;

class Q13 {
    public static void main(String[] args) {
        int[] ar = { 32, 45, 68, 74, 59, 99, 14, 39};
        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39]
        System.out.println("Length : " + ar.length); // 8

        // add 99 to last index of array

        int[] temp=new int[ar.length+1];
        for (int i=0;i< ar.length;i++){
            temp[i]=ar[i];
        }
        temp[temp.length-1]=99;
        ar=temp;

        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39, 99]
        System.out.println("Length : " + ar.length); // 9
    }
}
