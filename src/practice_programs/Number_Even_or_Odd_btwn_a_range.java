package practice_programs;

public class Number_Even_or_Odd_btwn_a_range {
    //// Find Even & Odd no between 1-50

    public static void main(String[] args){
        for(int i= 1; i<=50; i++){
            if(i%2==0){
                System.out.println(i + "-No is Even");
            }else if(i%2!=0){
                System.out.println(i +"-No is Odd");
            }
        }
    }
}
