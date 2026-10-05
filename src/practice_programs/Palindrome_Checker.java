package practice_programs;

import java.util.Scanner;

public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.next();
        String reverse_str = "";

        for(int i= str.length()-1; i>=0; i--){
            reverse_str =reverse_str + str.charAt(i);
        }
        if (reverse_str.equalsIgnoreCase(str)){
            System.out.println(reverse_str + " is a Palindrome");
        }else{
            System.out.println(reverse_str + " is not a Palindrome");
        }
    }
}
