/**
 * Write a Java program to get a Year from user input and find whether it is a leap year or not.
 */

package Assingment_04;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        do {

            System.out.print("Enter an year: ");
            year = input.nextInt();

            if (year % 400 == 0) {
                System.out.println("Leap year!");
            } else if (year % 100 == 0) {
                System.out.println("Not Leap year!");
            } else if (year%4==0){
                System.out.println("Leap year!");
            }else {
                System.out.println("Not Leap year!");
            }
        }while (year!=0);
    }
}
