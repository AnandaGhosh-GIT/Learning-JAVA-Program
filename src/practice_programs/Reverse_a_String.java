package practice_programs;

import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String: ");
        String input = scanner.next();
        String reverse_input = "";

        for(int i=input.length()-1; i>=0; i--){
            reverse_input =reverse_input + input.charAt(i);
        }
        System.out.println(reverse_input);
        scanner.close();

    }
}
