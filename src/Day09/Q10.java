package Day09;

import java.util.Arrays;
import java.util.Scanner;

// Q435 Exercise 13
// add user input details to an array

class Example {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks (Press -1 to terminate the program) : ");
        int marks = input.nextInt();
        int[] marksArr = new int[0];
        while (marks != -1) {
            // add to array
            System.out.println("Input marks (Press -1 to terminate the program) : ");
            marks = input.nextInt();
        }
        System.out.println(Arrays.toString(marksArr));

    }
}

