package practice_programs;

import java.util.Scanner;

public class Basic_Calculator_using_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =readInt("Enter 1st Number: ",scanner);
        int b= readInt("Enter 2nd Number: ",scanner);

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println("Sum= " + result_sum);
        System.out.println("Sub= " + result_sub);
        System.out.println("Mul= " + result_mul);
        System.out.println("Div= " + result_div);
        System.out.println("Mod= " + result_mod);

        scanner.close();

    }

    public static int readInt(String prompt, Scanner scanner){
        System.out.print(prompt);
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }else{
            System.out.println("Enter the int Only!");
            System.exit(0); //stops the program
            return 0; //required by the compiler for method completeness.
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
