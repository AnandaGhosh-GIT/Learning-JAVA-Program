package practice_programs;

import java.util.Scanner;

public class Factorial_of_any_Number {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int factorial = 1;

        if(input.hasNextInt()) {
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of the Number is: " + factorial);
        }else{
            System.out.println("Enter a valid input");
        }
    }
}
