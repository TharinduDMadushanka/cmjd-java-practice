package Assingment_04; /**
 * Input two numbers and check whether the first number is greater than the second number. If so add the two numbers otherwise display the two numbers.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter 1st nb:");
        int nb1=input.nextInt();

        System.out.print("Enter 2nd nb:");
        int nb2= input.nextInt();

        if (nb1>nb2){
            int sum=nb1+nb2;
            System.out.println("Sum --> "+sum);
        }else {
            System.out.println("Nb 1: "+nb1+"\nNb 2: "+nb2);
        }
    }
}