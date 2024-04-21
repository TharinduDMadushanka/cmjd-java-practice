package Basics;

//CONTROL FLOW
//sum of numbers from 1 to n, where n is provided by the user.
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number:");
        int nb =input.nextInt();

        int sum=0;

        for(int i=1;i<=nb;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

