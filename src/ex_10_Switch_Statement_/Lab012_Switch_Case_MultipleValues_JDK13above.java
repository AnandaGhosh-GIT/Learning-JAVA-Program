package ex_10_Switch_Statement_;

public class Lab012_Switch_Case_MultipleValues_JDK13above {
    public static void main(String[] args) {
        int itemcode = 006;

        ////Above JDK13 we can declare multiple values at a time in each cases
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadgets");
                break;
            case 004,006,007:
                System.out.println("This are Mechanical Gadgets");
                break;
            default:
                System.out.println("None");
        }
    }
}
