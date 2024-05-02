package Day09_Multidimensional_Arrays;

// add random numbers for 2d array

import java.util.Random;
import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input No of Student : ");
        final int N = scanner.nextInt();

        System.out.print("Input No of Subject : ");
        final int S = scanner.nextInt();

        Random input = new Random();
        int marks[][] = new int[N][S];

        // 10-> No of Students, No of Rows, Length of 2D array
        // 4 -> No of Subjects, No of Columns, Length of 1D array

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < S; i++) {
                marks[j][i] = input.nextInt(101);
            }
        }

        // print marks

        for (int i=0;i<S;i++){
            System.out.print("Sub "+(i+1)+"\t");
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < S; j++) {
                System.out.print(marks[i][j] + "\t\t");
            }
            System.out.println();
        }

    }
}
