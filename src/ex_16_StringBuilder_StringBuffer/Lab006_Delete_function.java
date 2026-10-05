package ex_16_StringBuilder_StringBuffer;

public class Lab006_Delete_function {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(6, 11);
        System.out.println(sb);
    }
}
