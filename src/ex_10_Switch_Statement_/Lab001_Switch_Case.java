package ex_10_Switch_Statement_;

import java.util.Scanner;

public class Lab001_Switch_Case {
    public static void main (String[] args){

        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the number from 1 to 7 for the day program");

        if(scanner.hasNextInt()) { //Edge cases> We are checking first the input data
                                    //is integer or not!

            ////The scanner.hasNextInt() method in Java
            //checks if the very next token in the input stream can be interpreted as a valid integer.
            // It returns true if the input is an integer within
            // the range of -2,147,483,648 to 2,147,483,647,
            // and false otherwise.

            int day = scanner.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Please enter valid number from 1 to 7");
                    break;

            }
        }

        else{
            System.out.println("Invalid data is entered!");
        }
    }
}
