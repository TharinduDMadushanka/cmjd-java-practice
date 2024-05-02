package Day09;

// Q450 from Q441 can solve their logical issue by make ar array static

import java.util.Arrays;

class Q20 {

    public static int ar[] = { 32, 45, 68, 74, 59, 99, 14, 39};

    public static void add(int val){
        int temp[] = new int[ar.length +1];
        for(int i = 0; i < ar.length; i++){
            temp[i] = ar[i];
        }
        temp[temp.length -1] = val;
        ar = temp;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39]
        System.out.println("Length : " + ar.length); // 8

        // add 99 to Last index
        add(99);

        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39, 99]
        System.out.println("Length : " + ar.length); // 9
    }
}

