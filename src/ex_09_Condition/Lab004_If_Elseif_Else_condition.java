package ex_09_Condition;

import java.util.Scanner;

public class Lab004_If_Elseif_Else_condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        //// Whichever condition is true that gots print, then the ladder terminates
        if (score >= 90) {
            System.out.println("Grade: A");
        }
        else if (score >= 80) {
            System.out.println("Grade: B");
        }
        else if (score >= 70) {
            System.out.println("Grade: C");
        }
        else if (score >= 60) {
            System.out.println("Grade: D");
        }
        else if (score >= 50) {
            System.out.println("Grade: E");
        }
        else {
            System.out.println("Grade: F");
        }
        input.close(); //closing the scanner class
    }
}
