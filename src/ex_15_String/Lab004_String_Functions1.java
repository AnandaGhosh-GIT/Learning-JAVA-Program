package ex_15_String;

public class Lab004_String_Functions1 {
    public static void main(String[] args) {

        //char is only single character
        char c1 = 'A';
        //string is bunch-of characters
        String s1 = "ABCD"; //// Creates new string in string constant pool
        System.out.println(s1);
        System.out.println(s1.length()); ////Checks the length of the string(return int value)
        System.out.println(s1.toLowerCase()); //// Creates new string in string constant pool
        System.out.println(s1.toUpperCase()); //It will work but use the original string
        System.out.println(s1.concat("E"));


        ////The toString() method in Java returns a textual representation of an object.
        //Its primary purpose is to convert an object's state into a readable string,
        // making it highly useful for debugging, logging, and displaying data.
        // Because every class in Java automatically inherits from the root Object class,
        // every single object in Java has access to this method.
        System.out.println(s1.toString());

        char c2 = s1.charAt(3); //// charAt- function indicate the index(start from 0)
        System.out.println(c2);

        int result = "abc".compareTo("ABC");
        System.out.println(result);

        int idx1 = "JAVA".indexOf("A");
        System.out.println(idx1);

        int idx2 ="ANANDA".lastIndexOf("A");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String message = String.join("-","JAVA","is","ccol");
        System.out.println(message);

        String s2 = "ANANDA".replace("A","O");
        System.out.println(s2);

        boolean s3 = "JAVA".startsWith("An");
        System.out.println(s3);





    }
}
