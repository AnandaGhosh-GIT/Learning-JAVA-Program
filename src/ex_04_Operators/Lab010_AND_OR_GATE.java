package ex_04_Operators;

public class Lab010_AND_OR_GATE {
    public static void main(String[] args) {

        //OR GATE
        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        //AND GATE
        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False

    }
}
