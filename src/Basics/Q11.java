package Basics;

// Java control flow "if-else"

import java.util.Scanner;

public class Q11 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Student Marks : ");
        double marks = input.nextDouble();

        if(marks >= 50){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
