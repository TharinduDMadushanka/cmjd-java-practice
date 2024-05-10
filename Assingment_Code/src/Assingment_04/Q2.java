package Assingment_04; /**
 * Write a java program to find the absolute number of a given integer number
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("Enter any integer:");
        int nb= input.nextInt();

        if (nb<0){
            int abNb = -(nb);
            System.out.println("Absolute nb -> "+abNb);
        }else {
            System.out.println("Absolute nb -> "+nb);
        }
    }
}
