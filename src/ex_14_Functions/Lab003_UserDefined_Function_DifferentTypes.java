package ex_14_Functions;

public class Lab003_UserDefined_Function_DifferentTypes {
    public static void main(String[] args){
        System.out.println("Inside the main method...");

        //Calling the user-defined method
        WHP_WHR();

        String message=WHP_WR();
        System.out.println(message);

        WP_WHR("Ananda",31,75);

        int sum=WP_WR(10,5);
        System.out.println("Sum of two Number is: " + sum);

        System.out.println("Back in the main method.");
    }

    //// 1. Without Parameters and Without Return Type
    public static void WHP_WHR() {
        System.out.println("Hello! This function has no parameters and no return type.");
        System.out.println("It simply executes its inner code block.");
    }

    //// 2. Without Parameters but With Return Type
    public static String WHP_WR() {
        return "Welcome";
    }

    //// 3. With Parameters and Without Return Type(90% usage)
    public static void WP_WHR(String name, int age, int weight) {
        System.out.println(name + "-Age " + age + ", Weight " + weight);
    }

    //// 4. With Parameters and With Return Type
    public static int WP_WR(int x, int y) {
        return(x+y);
    }

}
