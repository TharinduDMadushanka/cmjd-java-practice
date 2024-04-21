package Basics;

// Ternary Operator, Conditional Operator, if/then else Operator (? :)

import java.util.Scanner;

class Example{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Salary : ");

        double salary = input.nextDouble();

        // if(salary >= 100000){
        // 	salary = salary * 1.01;
        // } else {
        // 	salary = salary * 1.02;
        // }

        salary = salary >= 100000 ? salary * 1.01 : salary * 1.02;

        System.out.println("New salary : " + salary);
    }
}
