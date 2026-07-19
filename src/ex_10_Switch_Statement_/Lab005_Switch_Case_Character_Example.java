package ex_10_Switch_Statement_;

public class Lab005_Switch_Case_Character_Example {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII"); //char is Integral in nature
                break;
            default:
                System.out.println("No Match");
        }
    }
}
