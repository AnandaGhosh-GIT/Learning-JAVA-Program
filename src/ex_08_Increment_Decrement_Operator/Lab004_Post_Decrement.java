package ex_08_Increment_Decrement_Operator;

public class Lab004_Post_Decrement {
    public static void main(String[] args){
        int a = 10;
        int b = a--;
        System.out.println(a);
        System.out.println(b);

        ////  Exp and Result Table
        // Line No | Result a | Result b
        //  5 |  10 | NA |
        //  6 |  10 | 9  |  //'a's value is stored first in 'b' then decremented
        //  7 |  9 - a | NA
        //  8 |  9  | 10 - b

    }
}
