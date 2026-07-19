package ex_10_Switch_Statement;

public class Lab011_Switch_Case_JDK13above_NewFeature {
    public static void main(String[] args) {
        // in JDK > 13
        int itemCode  = 002;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");

            //// Above JDK13 we can use switch-case with Arrow
            //// Break is applied by default in this format for each case


        }
    }
}
