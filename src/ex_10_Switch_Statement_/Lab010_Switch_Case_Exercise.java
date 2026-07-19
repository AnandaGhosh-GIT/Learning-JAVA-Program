package ex_10_Switch_Statement_;

public class Lab010_Switch_Case_Exercise {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo"); //switch can start with default also,
                //break;                                // no restriction there
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
