package ex_16_StringBuilder_StringBuffer;

public class Lab001_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {

        //String- 90% time we will use this
        String s1 = "Ananda";
        String s2 = new String("Ghosh");

        // less than 10% time use
        StringBuilder sb = new StringBuilder("Ananda");
        StringBuffer sB = new StringBuffer("Ananda");

    }
}
