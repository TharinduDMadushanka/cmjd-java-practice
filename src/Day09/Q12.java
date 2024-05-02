package Day09;

import java.util.Arrays;

//Q439 Exercise 15
class Q12 {



    public static void main(String[] args) {
        int ar[] = { 32, 45, 68, 74, 59, 99, 14, 39, 24, 99, 92 };
        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39, 24, 99, 92]

        int br[] = removeDuplicate(ar);
        System.out.println(Arrays.toString(br)); // [32, 45, 68, 74, 59, 99, 14, 39, 24, 92]
    }

    public static boolean isDuplicate(int value, int[] ar){
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == value){
                return true;
            }
        }

        return false;
    }

    public static int[] removeDuplicate(int[] ar){
        int[] br=new int[0];

        for (int i=0;i<ar.length;i++){
            if (!isDuplicate(ar[i],br )){
                int [] temp=new int[br.length+1];
                for (int j=0;j<br.length;j++) {
                    temp[j]=br[j];
                }
                temp[temp.length-1]=ar[i];

                br=temp;
            }
        }
        return br;
    }
}

