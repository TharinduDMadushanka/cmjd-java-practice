package Assingment_04;

/**
 * Write a Java program to find & print the area of a circle when user input the radius.
 */

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        double pie =3.14;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter 'r' value :");
        double r= input.nextDouble();

        double radius=2*pie*r*r;

        System.out.println("Radius is :"+radius);
    }
}
