package Day09_Multidimensional_Arrays;

// step 1 for add user input data for 2d array

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks[][] = new int[10][4];

        // 10-> No of Students, No of Rows, Length of 2D array
        // 4 -> No of Subjects, No of Columns, Length of 1D array

        // read student 1 marks
        System.out.println("Input marks for Student 1 : ");
        for(int i = 0; i< 4; i++){
            System.out.print("Input marks for Subject " + (i + 1) + " : " );
            marks[0][i] = input.nextInt();
        }


        // read student 2 marks
        System.out.println("Input masks for Student 2 : ");
        for(int i = 0; i< 4; i++){
            System.out.print("Input marks for Subject " + (i + 1) + " : " );
            marks[1][i] = input.nextInt();
        }
    }
}

