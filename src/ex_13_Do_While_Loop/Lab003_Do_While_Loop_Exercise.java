package ex_13_Do_While_Loop;

public class Lab003_Do_While_Loop_Exercise {
    public static void main (String[] args){
        // Web Automation
        int number = 0;
        // 0 -> it can be 0 to 10 - elements or students
        do{
            System.out.println(number);
            // callFunction(number);
            // close the excel file, open the file.
            number++;
        }while (number < 0);
    }
}
