package Basics;

// Return typed Methods

import java.util.Scanner;

class Q25{

    public static int printSumOfTwoNumber(int num1, int num2){
        int total = num1 + num2;
        return total;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input num 1 : ");
        int num1 = input.nextInt();

        System.out.print("Input num 2 : ");
        int num2 = input.nextInt();

        int total;

        total = printSumOfTwoNumber(num1, num2); // Method calling statement

        System.out.println("Total : " + total);
    }
}
