package Basics;

// Java control flow "if-else" ladder

import java.util.Scanner;

class Q12{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Marks : ");
        double marks = scanner.nextDouble();

        if(marks >= 75){
            System.out.println("Grade A");
        } else if(marks >= 65){
            System.out.println("Grade B");
        } else if(marks >= 50){
            System.out.println("Grade C");
        } else if(marks >= 35){
            System.out.println("Grade S");
        } else {
            System.out.println("Grade F");
        }


    }
}
