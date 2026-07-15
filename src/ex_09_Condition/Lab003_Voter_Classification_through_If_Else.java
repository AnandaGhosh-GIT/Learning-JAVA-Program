package ex_09_Condition;

import java.util.Scanner;

public class Lab003_Voter_Classification_through_If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age > 18) {
            System.out.println(name + " is " + age + ", he/she can vote");
        }
        else {
            System.out.println(name + " is " + age + ", he/she can't vote");
        }
    }
}
