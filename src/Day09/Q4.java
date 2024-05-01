package Day09;

// search an index regarding given value
//Q423 Exercise 8 (Search Index)

import java.util.Arrays;

class Q4 {


    public static void main(String[] args) {
        int ar[] = {32,45,68,74,59,99,14,39,24,68,92}; // there are two 68 values and give last values index
        System.out.println(Arrays.toString(ar));

        int index;
        int key;

        key = 68;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index); // 9

        key = 14;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index); // 6

        key = 100;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index); // -1
    }

    public static int searchIndex(int[] ar,int key){

        int index=-1;
        for (int i=0;i<ar.length;i++){
            if (key==ar[i]){
                index=i;
        }
    }
        return index;
}
}