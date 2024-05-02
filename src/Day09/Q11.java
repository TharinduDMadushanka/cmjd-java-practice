package Day09;

//Q437 Exercise 14
//// add user input details to an array & check that input is duplicate or not

import java.util.Arrays;
import java.util.Scanner;

class Q11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks (Press -1 to terminate the program) : ");
        int marks = input.nextInt();
        int[] marksArr = new int[0];
        while (marks != -1) {
            // Check Duplicate
            // add to array

            boolean isDuplicate=isDuplicate(marks,marksArr);
            if (isDuplicate){
                System.out.println("Duplicate value");
            }else {
                int[] temp=new int[marksArr.length+1];

                for (int i=0;i<marksArr.length;i++){
                    temp[i]=marksArr[i];
                }
                temp[temp.length-1] = marks;
                marksArr = temp;
            }

            System.out.println("Input marks (Press -1 to terminate the program) : ");
            marks = input.nextInt();
        }
        System.out.println(Arrays.toString(marksArr));

    }

    public static boolean isDuplicate(int value, int[] ar){
        for (int i=0;i<ar.length;i++){
            if (ar[i]==value){
                return true;
            }
        }
        return false;
    }
}

