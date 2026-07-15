package practice_programs;

import java.util.Scanner;

public class Grade_Calculator_Using_If_Else_condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        }
        else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        }
        else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        }
        else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
        input.close();
    }
}
