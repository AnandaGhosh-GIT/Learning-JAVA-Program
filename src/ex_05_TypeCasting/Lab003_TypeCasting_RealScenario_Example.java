package ex_05_TypeCasting;

public class Lab003_TypeCasting_RealScenario_Example {
    private static Object total_price3;

    public static void main(String[] args) {
        int product_price = 100;
        float tax = 10.56f;

        // int total_price1= product_price + tax; //Implicit Narrowing--Float>Int
        int total_price2 = product_price + (int)tax; // Explicit Narrowing
        System.out.println("Total price 1 is " + total_price2);
        // but here we lose some .56 values from 10.56

        float total_price3 = product_price + tax; //Implicit Widening
        float total_price4 = (float)product_price + tax; //Explicit Widening
        System.out.println("Total price 2 is " + total_price3);
        //Here no data/transaction loss is happening

        //// We always have to carefullly select the datatype in-case of typecasting
        //// Always try to choose bigger basket(datatype) to avoid data loss

    }
}
