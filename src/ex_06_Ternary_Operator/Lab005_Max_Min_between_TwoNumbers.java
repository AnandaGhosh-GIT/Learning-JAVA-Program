package ex_06_Ternary_Operator;

public class Lab005_Max_Min_between_TwoNumbers {
    public static void main(String[] args) {
        int x =20;
        int y =10;
        int max = x > y ? x : y;
        int min = x < y ? x : y;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
