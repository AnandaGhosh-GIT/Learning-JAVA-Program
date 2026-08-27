package ex_11_For_Loop;

import java.util.Scanner;

public class Lab011_For_Loop_Continue {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();
        for(int i=0; i<num; i++){
            if(i==5){
                continue; //when the condition matches it will SKIP the below part and
                          // start again from the loop
            }
            System.out.println(i);
        }
    }
}
