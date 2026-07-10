package ex_08_Increment_Decrement_Operator;

public class Lab003_Pre_Decrement {
    public static void main(String[] args) {
        int a = 10;
        int b = --a;
        System.out.println(a);
        System.out.println(b);

        ////  Exp and Result Table
        // Line No | Result a | Result b
        //  5 |  10 | NA |
        //  6 |  9  | 9  |  //'a's value is decremented first then stored to 'a' which is then assigned to 'b'
        //  7 |  9 - a | NA
        //  8 |  9  | 9 - b
    }
}
