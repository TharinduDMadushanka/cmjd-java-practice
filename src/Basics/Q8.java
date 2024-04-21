package Basics;
// Java control flow "if"

import java.util.*;

class Q8{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int num = input.nextInt();

        System.out.println("A");
        System.out.println("B");
        if(num>10) { // Code Block Start
            System.out.println("C");
            System.out.println("D");
        } // Code Block End
        System.out.println("E");
        System.out.println("F");
    }
}

