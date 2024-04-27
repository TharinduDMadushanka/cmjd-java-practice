package Day09;

import java.util.Arrays;

class Q3 {

    public static void main(String[] args) {
        int ar[] = {100, 200, 300, 400, 500, 600};
        int br[] = new int[ar.length];
        int cr[] = new int[ar.length-3];
        int dr[] = new int[ar.length+3];

        copyValueFromTo(ar, br);
        copyValueFromTo(ar, cr);
        copyValueFromTo(ar, dr);

        System.out.println(Arrays.toString(ar)); // [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(br)); // [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(cr)); // [100, 200, 300]
        System.out.println(Arrays.toString(dr)); // [100, 200, 300, 400, 500, 600, 0, 0, 0]

    }
    public static void copyValueFromTo(int[] from, int[] to){
        for(int i = 0; i < from.length; i++){
            to[i] = from[i];
        }
    }

    public static void copyValueFromTo(int[] ar,int[] cr){
        
    }
}

