package ex_14_Functions;

import java.util.Scanner;

public class Lab006_SumOf_TwoNumbers_using_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st Number: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd Number: ");
        int b = scanner.nextInt();
        System.out.println("Sum of two Number is: " + sum_of_two_numbers(a,b));

    }
    static int sum_of_two_numbers(int x, int y) {
        return(x+y);
    }
}
