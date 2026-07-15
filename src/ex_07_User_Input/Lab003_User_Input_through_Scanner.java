package ex_07_User_Input;

import java.util.Scanner;

public class Lab003_User_Input_through_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println(name + age);

        //float height = input.nextFloat();
        //double weight = input.nextDouble();
        //long mobile_number = input.nextLong();
    }
}
