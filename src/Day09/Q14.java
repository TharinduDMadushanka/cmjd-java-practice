package Day09;

// from previous question
// this will be a logical issue because add method never return ar array
// because of that it still refer old ar array not after adding ar array
// we can fix this by change void ---> int[] return type and return ar array after adding values

import java.util.Arrays;

class Q14 {

    public static void main(String[] args) {
        int ar[] = { 32, 45, 68, 74, 59, 99, 14, 39};
        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39]
        System.out.println("Length : " + ar.length); // 8

        // add 99 to Last index
        add(ar, 99);

        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39, 99]
        System.out.println("Length : " + ar.length); // 9
    }

//    public static void add(int[] ar, int val){
//        int temp[] = new int[ar.length +1];
//        for(int i = 0; i < ar.length; i++){
//            temp[i] = ar[i];
//        }
//        temp[temp.length -1] = val;
//        ar = temp;
//    }

    public static int[] add(int[] ar, int val){
        int temp[] = new int[ar.length +1];
        for(int i = 0; i < ar.length; i++){
            temp[i] = ar[i];
        }
        temp[temp.length -1] = val;
        ar = temp;
        return ar;

    }

}
