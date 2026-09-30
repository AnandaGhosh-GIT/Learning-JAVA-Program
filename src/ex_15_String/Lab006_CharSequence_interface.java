package ex_15_String;

public class Lab006_CharSequence_interface {
    public static void main (String[] args) {

        ////CharSequesnce is an interface which allows users to create String also
        CharSequence s = "Ananda";
        System.out.println(s);
        System.out.println(s.subSequence(1,5));
        ////subSequence method extracts a portion of the text-
        // starting from the start index up to end - 1(the end index is exclusive)


    }
}
