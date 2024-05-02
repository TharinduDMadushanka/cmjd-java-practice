package Day09;

// Q451 Exercise 17
// add a value for 5 th index in an array

import java.util.Arrays;

class Q21 {

    public static int ar[] = { 32, 45, 68, 74, 59, 99, 14, 39};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39]
        System.out.println("Length : " + ar.length); // 8

        // add 99 to Last index
        add(99);

        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 99, 14, 39, 99]
        System.out.println("Length : " + ar.length); // 9

        add(75, 5); // add (val, index)

        System.out.println(Arrays.toString(ar)); // [32, 45, 68, 74, 59, 75, 99, 14, 39, 99]
        System.out.println("Length : " + ar.length); // 10
    }

    public static void add(int val){
        int temp[] = new int[ar.length +1];
        for(int i = 0; i < ar.length; i++){
            temp[i] = ar[i];
        }
        temp[temp.length -1] = val;
        ar = temp;
    }

    public static void add(int val,int index){
        if (index>=0 && index <= ar.length){
            int[] temp=new int[ar.length+1];

            for (int i=0;i<index;i++){
                temp[i]=ar[i];
            }
            temp[index]=val;

            for (int i=index+1;i< temp.length;i++){
                temp[i]=ar[i-1]; //***** don't understand
            }
            ar=temp;
        }else {
            System.out.println("Error index.");
        }
    }
}

