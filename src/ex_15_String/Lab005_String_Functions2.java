package ex_15_String;

public class Lab005_String_Functions2 {
    public static void main(String[] args) {

        String s1 = "JAVA".substring(2);
        System.out.println(s1);

        char[] arr = "JAVA".toCharArray();
        System.out.println(arr);
        //// toCharArray method converts a text string into a new character array.
        // Allocates memory for a brand-new char array.
        // Sets the size of the new array to exactly match the length of the string (in this case, 4 elements).
        // Copies each character from the string "JAVA" into the corresponding index of the array.

        boolean b = " ".isEmpty();
        System.out.println(b);
        //// isEmpty() method is true only if length() is 0, otherwise false(space also considerable)

        String s2 = "Ananda".repeat(3);
        System.out.println(s2);

        long counting = "a\nb\nc".lines().count();
        System.out.println(counting);

        String s3 = "    Ananda Ghosh  ";
        System.out.println(s3.trim());


        //// split() method of the String class divides a string into an array of
        //// substrings based on a specified delimiter or regular expression (regex)
        String s4 ="Hello World";
        String[] s5 =s4.split(" ");
        System.out.println(s5[0]);
        System.out.println(s5[1]);



    }
}
