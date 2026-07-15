package practice_programs;

import java.util.Scanner;

public class Triangle_Classifier_Using_If_Else_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side 1 of triangle: ");
        int s1 = sc.nextInt();
        System.out.print("Enter the side 2 of triangle: ");
        int s2 = sc.nextInt();
        System.out.print("Enter the side 3 of triangle: ");
        int s3 = sc.nextInt();

        if(s1 == s2 && s2 == s3){
            System.out.println("The triangle is Equilateral");
        } else if(s1 == s2 ||  s2==s3 || s1 == s3) {
            System.out.println("The triangle is Isosceles");
        } else{
            System.out.println("The triangle is Scalene");
            }
    }
}
