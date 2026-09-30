package ex_16_StringBuilder_StringBuffer;

public class Lab004_Replace_function {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JAVA");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);

    }
}
