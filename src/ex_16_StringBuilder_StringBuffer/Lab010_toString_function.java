package ex_16_StringBuilder_StringBuffer;

public class Lab010_toString_function {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        String str = sb.toString(); //// Converts the StringBuilder/Buffer into String
        System.out.println(str); //Prints the String which is immutable
    }
}
