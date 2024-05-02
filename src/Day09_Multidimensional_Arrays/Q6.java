package Day09_Multidimensional_Arrays;

import java.util.Scanner;

//step 2 for add user input data for 2d array

class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[][] = new int[10][4];

        // 10-> No of Students, No of Rows, Length of 2D array
        // 4 -> No of Subjects, No of Columns, Length of 1D array

        for (int j = 0; j < 10; j++) {
            System.out.println("Input marks for Student " + (j + 1) + " : ");
            for (int i = 0; i < 4; i++) {
                System.out.print("Input marks for Subject " + (i + 1) + " : ");
                marks[j][i] = input.nextInt();
            }
        }
    }
}
