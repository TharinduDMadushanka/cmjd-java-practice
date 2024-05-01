package Day09;

// //Q423 Exercise 8 (Search Index) option 2


import java.util.Arrays;

class Q5 {

    public static void main(String[] args) {
        int ar[] = {32,45,68,74,59,99,14,39,24,68,92}; // there are two 68 values and get 1st value index
        System.out.println(Arrays.toString(ar));

        int index;
        int key;

        key = 68;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index); // 2

        key = 14;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index); // 6

        key = 100;
        index = searchIndex(ar, key);
        System.out.println("Index of " + key + " : " + index); // -1
    }

    public static int searchIndex(int[] ar, int key){
        int index = -1;
        for(int i = 0; i < ar.length; i++){
            if(key == ar[i]){
                index = i;
                break; // if reach first index value then break the loop
            }
        }

        return index;
    }
}
