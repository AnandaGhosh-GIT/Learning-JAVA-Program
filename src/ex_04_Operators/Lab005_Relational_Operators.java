package ex_04_Operators;

public class Lab005_Relational_Operators {
    private static Object age_Subarna;

    public static void main(String[] args) {
        // (<) Less Than
        // (<=) Less than or equal to
        // (>) Greater
        // (>=) Greater than or equal to
        // (==) Equal to (but checking)
        // (!=) Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // 10> 30
        System.out.println(c);

        int age_Ananda = 30;
        int age_Subarna = 27;

        boolean result = age_Ananda >= age_Subarna;
        System.out.println(result);

        //// relational operators always yield a boolean result (true or false)
    }
}
