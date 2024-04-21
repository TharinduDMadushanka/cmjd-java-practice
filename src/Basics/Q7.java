package Basics;

import java.util.Scanner;
//Sum of user input number
public class Q7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number:");
        int nb = input.nextInt();

        int sum =0;
        while (nb != 0){
            sum+=nb%10;
            nb/=10;
        }
        System.out.println(sum);
    }
}

