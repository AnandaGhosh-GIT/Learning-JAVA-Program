package ex_11_For_Loop;

public class Lab012_For_Loop_Even_number_with_Continue_keyword {
    public static void main (String args[]){

        ////Printing Even Number
        for(int i=0; i<=50; i++){
            if(i%2!=0){
                continue; //this will skip all the Odd numbers
            }
            System.out.println(i);
        }
    }
}
