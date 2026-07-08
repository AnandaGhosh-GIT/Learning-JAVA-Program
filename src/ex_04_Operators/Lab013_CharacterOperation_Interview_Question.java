package ex_04_Operators;

public class Lab013_CharacterOperation_Interview_Question {
    public static void main(String[] args) {

        ////Question 1
        char a1 = 'A'; //  ASCII - 65
        char a2 = 'B'; //  ASCII - 66
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1+a2); //131
        System.out.println(a1-a2); //-1
        // char are noting but integer,
        // hence during mathematical operation it's ASCII value counts

        ////Question 2
        short s = 10;
        char c = 'A'; //65
        System.out.println(c + s); // 65+10->True

        ////Question 3
        System.out.println('A' == 65);//->True

    }
}
