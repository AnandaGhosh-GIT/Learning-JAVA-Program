package ex_15_String;

public class Lab003_String_Creation_Exercise {
    public static void main (String[] args) {
        //// String Constant Pool
        String S1 = "Hello"; //Creates New String
        String S2 = "Hello"; // Refers to S1
        String S3 = "hello"; // Creates New String

        //// Object area
        String S4 = new String("Hello"); //Creates New String
        String S5 = new String("Hello"); //Creates New String
        String S6 = new String("hello"); //Creates New String


        //// == Comparison operator > Check the ref in string
        System.out.println(S1==S4);
        System.out.println(S1==S3);
        System.out.println(S5==S4);
        System.out.println(S1==S2);
        System.out.println(S3==S6);


        ////equals - checks contents(values)
        System.out.println(S1.equals(S4));
        System.out.println(S1.equals(S3));
        System.out.println(S5.equals(S4));
        System.out.println(S1.equals(S2));
        System.out.println(S3.equals(S5));

        ////eqalsIgnoreCase
        System.out.println(S3.equalsIgnoreCase(S5));
        //both of them converted into lower case then values are compared




    }
}
