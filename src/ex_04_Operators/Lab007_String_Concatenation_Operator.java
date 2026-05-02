package ex_04_Operators;

public class Lab007_String_Concatenation_Operator {
    public static void main(String[] args) {
        // + -> Integer ->Addition
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        // + -> String -> Concatenation
        String first_name = "Ananda";
        String last_name = "Ghosh";
        System.out.println(first_name+last_name); // concatenation

        ////Only + operator works in Concatenation, other operators will through error
       //System.out.println(first_name-last_name);
       //System.out.println(first_name*last_name);
       //System.out.println(first_name/last_name);

    }
}
