package ex_07_User_Input;

public class Lab002_Pass_0r_Fail_through_CLIinput {
    public static void main(String[] args) {
        int S1_marks =Integer.parseInt(args[0]);
        int S2_marks =Integer.parseInt(args[1]);
        int S3_marks =Integer.parseInt(args[2]);
        String result1= (S1_marks>=40) ?"PASS":"FAIL";
        String result2= (S2_marks>=40) ?"PASS":"FAIL";
        String result3= (S3_marks>=40) ?"PASS":"FAIL";
        System.out.println("S1 " +result1);
        System.out.println("S2 " +result2);
        System.out.println("S3 " +result3);
    }
}
