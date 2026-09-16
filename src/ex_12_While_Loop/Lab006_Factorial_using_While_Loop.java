package ex_12_While_Loop;

public class Lab006_Factorial_using_While_Loop {
    public static void main (String[] args){
        int n=5;
        int factorial=1;
        int i=1;
        while(i<=n){
            factorial =factorial*i;
            i++;
        }
        System.out.println(factorial);
    }
}
