package ex_11_For_Loop;

public class Lab013_For_Loop_Odd_number_with_Continue_keyword {
    public static void main(String args[]){

        ////Printing Odd Number
        for(int i=0; i<=50; i++){
            if(i%2==0){
                continue; //this will skip all the Even numbers
            }
            System.out.println(i);
        }
    }
}
