package ex_16_StringBuilder_StringBuffer;

public class Lab002_Append_function {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ananda");
        System.out.println(sb.append("Ghosh"));

        StringBuffer sB = new StringBuffer("Ananda");
        System.out.println(sB.append(" Ghosh"));
    }
}
