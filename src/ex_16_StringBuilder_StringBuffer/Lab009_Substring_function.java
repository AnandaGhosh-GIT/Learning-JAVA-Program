package ex_16_StringBuilder_StringBuffer;

public class Lab009_Substring_function  {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Hello World");
        System.out.println(sb.substring(6)); //// Extracts a substring
        System.out.println(sb.substring(0,5));////Extracts a substring within a range
    }
}
