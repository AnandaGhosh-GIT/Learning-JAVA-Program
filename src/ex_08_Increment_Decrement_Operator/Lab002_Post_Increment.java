package ex_08_Increment_Decrement_Operator;

public class Lab002_Post_Increment {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        ////  Exp and Result Table
        // Line No | Result a | Result b
        //  5 |  10 | NA |
        //  6 |  11 | 10 |  //'a's value is stored first in 'b' then incremented
        //  7 |  11 - a | NA
        //  8 |  11 | 10 - b

    }
}
