package ex_05_TypeCasting;

public class Lab001_TypeCasting_Widening {
    public static void main(String[] args) {

        ////Widening is the process of converting lower datatype to higher datatype.
        byte b = 127;
        int i1=b; // Implicit Widening-Done by JVM/ JAVA automatically
        int i2=(int)b; //Explicit Widening-We are mentioning the datatype
        System.out.println(i1);
        System.out.println(i2);

        //For Widening there is no chance of Data Loss
        //Hence it doesn't matter if it is not done explicitly
    }
}
