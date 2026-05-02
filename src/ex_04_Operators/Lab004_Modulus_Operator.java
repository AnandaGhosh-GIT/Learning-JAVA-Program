package ex_04_Operators;

public class Lab004_Modulus_Operator {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(a%b);
        /*
                10 | 20 |  2 - Quotient
                   |   20 |
                    -------
                        0 - Remainder
        */


        System.out.println(13%7);
        /*
                // 7 | 13 | 1 - Quotient
                     |   7|
                     -------
                       6 - Remainder
        */

    //  How to Find a number is Even or Odd
        //// 11%2 -> 1 , 13%2 -> 1
        //// 10%2 -> 0
        //// 12%2 -> 0
        //// Number % 2 -> R-> 1 -> odd , 0 -> even

        // num%2 == 0 - even, else 1 odd

    }
}
