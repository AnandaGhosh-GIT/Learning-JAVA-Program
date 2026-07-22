package ex_11_For_Loop;

public class Lab008_Variable_Initialization_outside_For_Loop {
    public static void main(String[] args){
        int i =1;
        for( ;i<=10; ++i) { //It does not matter logically whether you use
            // (++i) / (i++) OR (--i) / (i--)
            // inside the update expression of a standard for loop.
            System.out.println(i);
        }
    }
}
