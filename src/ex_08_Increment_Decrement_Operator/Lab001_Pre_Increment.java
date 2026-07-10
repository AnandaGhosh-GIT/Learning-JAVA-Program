package ex_08_Increment_Decrement_Operator;

public class Lab001_Pre_Increment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;  // ++a ->  a= a+1
        System.out.println(a);
        System.out.println(b);


        ////  Exp and Result Table
        // Line No | Result a | Result b
        //  5 |  10 | NA |
        //  6 |  11 | 11 |  //'a's value is incremented first then stored to 'a' which is then assigned to 'b'
        //  7 |  11 - a | NA
        //  8 |  11 | 11 - b

    }
}
