package Basics;

// Parameterized Methods

import java.util.Scanner;

class Q24{

    public static void printSumOfTwoNumber(int a, int b){
        int total = a + b;
        System.out.println("Total : " + total);
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input num 1 : ");
        int num1 = input.nextInt();

        System.out.print("Input num 2 : ");
        int num2 = input.nextInt();

        printSumOfTwoNumber(num1, num2); // Method calling statement

        printSumOfTwoNumber(10, 30);
    }
}
