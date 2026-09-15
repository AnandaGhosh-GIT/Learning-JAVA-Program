package ex_12_While_Loop;

public class Lab003_FalseCondition_in_While_Loop {
    public static void main (String args[]){
        int i=0;
        while(i>0){ //Loop Body will not execute if the condition doesn't
                   // match at the start
            System.out.println("Enter");
            System.out.println(i);
            i++;
        }
    }
}
