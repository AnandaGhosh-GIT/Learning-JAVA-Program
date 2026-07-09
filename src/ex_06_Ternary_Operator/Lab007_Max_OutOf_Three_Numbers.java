package ex_06_Ternary_Operator;

public class Lab007_Max_OutOf_Three_Numbers {
    public static void main(String[] args) {
        int n1 = -2;
        int n2 = 9;
        int n3 = 11;
        int result = (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println(result);
    }
}
