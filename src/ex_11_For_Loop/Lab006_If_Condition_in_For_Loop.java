package ex_11_For_Loop;

public class Lab006_If_Condition_in_For_Loop {
    public static void main(String[] args){
        for( int Ananda_age =0; Ananda_age<18; Ananda_age++){
           if(Ananda_age>15){
               System.out.println("Ananda will get Birthday Gift");
           }
           else{
               System.out.println("No Gift");
           }
        }
        //For Loop's condition will run upto age=17
        //If condition will run 2 times age=16 &17
    }
}
