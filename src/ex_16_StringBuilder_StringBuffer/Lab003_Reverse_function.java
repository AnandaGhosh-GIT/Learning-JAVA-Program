package ex_16_StringBuilder_StringBuffer;

public class Lab003_Reverse_function {
    public static void main(String[] args) {

        //// StringBuilder & StringBuffer has inbuilt reverse function
        StringBuilder sb = new StringBuilder("Ananda");
        sb.append("Ghosh");
        sb.reverse();
        System.out.println(sb);

        StringBuffer sB = new StringBuffer("Hello");
        sB.append("World");
        sB.reverse();
        System.out.println(sB);

    }
}
