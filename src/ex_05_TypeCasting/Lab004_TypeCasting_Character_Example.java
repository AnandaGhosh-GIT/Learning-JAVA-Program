package ex_05_TypeCasting;

public class Lab004_TypeCasting_Character_Example {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; // Widening
        System.out.println(ascii);

        int num = 66; // Narrowing
        char letter = (char) num;
        System.out.println(letter);

        //Corresponding ASCII numbers(Widening) or the letters(Narrowing) are getting printed
    }
}
