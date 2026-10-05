package ex_16_StringBuilder_StringBuffer;

public class Lab005_Insert_function {
    public static void main(String[] args) {
        StringBuffer sB = new StringBuffer("Hello");
        sB.insert(5," Ananda");
        System.out.println(sB);
    }
}
