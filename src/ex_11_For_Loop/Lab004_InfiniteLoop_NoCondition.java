package ex_11_For_Loop;

public class Lab004_InfiniteLoop_NoCondition {
    public static void main(String[] args){
        for (int i=0; ;i++) { // As there is no condition given, code will run infinitely
            System.out.println(i);
        }

        //// exit code 130 , (Force Stop by Yourself)-Red Button
        ////exit code 0- Successful
    }
}
