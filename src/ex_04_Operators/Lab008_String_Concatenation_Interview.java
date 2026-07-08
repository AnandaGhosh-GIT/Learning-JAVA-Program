package ex_04_Operators;

public class Lab008_String_Concatenation_Interview {
    public static void main(String[] args) {
        String first_name = "Ananda";
        String last_name = "Ghosh";

        int a = 10;
        int b = 20;

        System.out.println(first_name + last_name  + a + b);
        //As first Concatenation is happening so it print as string


        System.out.println(a + b + first_name + last_name);
        // First integer is there hence sum will be done then Concatenation

        System.out.println(first_name + last_name + (a + b));
        // BODMAS- Rule of BODMAS, which says; Brackets, Order, Division, Multiplication,
        //         Addition and then Subtraction.

    }
}
