package ex_04_Operators;

public class Lab012_Interview_Question {
    public static void main(String[] args) {

        int ananda_salary = 12;
        boolean a = !(ananda_salary > 10 || ananda_salary < 5);
        System.out.println(a);


// Divide and Conquer!

        // A -> ananda_salary > 10 -> 12 >10 ->  true
        // B -> ananda_salary < 5 -> 12<5 -> false
        // (A || B) -> TRUE (true || false) -> true
        // !(true) -> False

    }
}
