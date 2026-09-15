package practice_programs;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game_Using_While_Loop {
    public static void main(String args[]){
        Random random = new Random();
        int numberToGuess = random.nextInt(100); // Guess a number from 1 to 100

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int guess;
        int attempts = 0;

        while(true){
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter integer number only!");
                scanner.next(); // Consume invalid token
                continue;
            }


            guess = scanner.nextInt();
            attempts++;
            if(guess < numberToGuess){
                System.out.println("Too Low, Try again!!");
            }else if( guess > numberToGuess){
                System.out.println("Too High, Try again");
            }else {
                System.out.println("Correct! You have taken -> " + attempts +" attempts");
                break;
            }
        }
    }
}
