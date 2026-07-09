package ex_06_Ternary_Operator;

public class Lab004_Nested_TernaryOperator {
    public static void main(String[] args) {
        int age = 25;
        String canBabiGotoGOA = age > 18 ? (age >= 25 ? "Babi can go Alone": "Babi have to go with parents") : "No Babi can't go to GOA";
        System.out.println(canBabiGotoGOA);

    }
}
