package ex_11_For_Loop;

public class Lab010_For_Loop_Break {
    public static void main(String args[]){
        for(int i =0; i<50; i++){
            System.out.println(i);
            if(i==5){
               break;
            }
        }


        //if we change the order a different op will be printed
 //       for(int i =0; i<50; i++){
 //           if(i==5){
 //               break;
 //           }
 //           System.out.println(i);
 //       }
    }
}
