package ex_11_For_Loop;

public class Lab005_InfiniteLoop_Wrong_or_NoUpdation {
    public static void main(String[] args){

        //Wrong Updation
        for(int i=0; i<5; i--){
            System.out.println(i);
        }

        //No Updation
        for(int i=0; i<10;){
        System.out.println(i);
        }
    ////In both the case it will loop forever
    }
}
