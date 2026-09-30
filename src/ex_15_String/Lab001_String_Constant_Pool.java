package ex_15_String;

public class Lab001_String_Constant_Pool {
    public static void main(String[] args) {
        String name = "Ananda"; ////String Literal is stored in String constant pool
        System.out.println(name);

        ////Strings are immutable in nature-Once created can't be changed
        // name.toLowerCase(); //Creates another new string in String Constant Pool
        // System.out.println(name); //Values didn't change as we haven't
                                  // assigned the new value

        //As we have assigned the new string value, now it will print the new string
        name = name.toLowerCase(); //// String can use JAVA built-in functions
        System.out.println(name);

        name = name.concat(" ghosh");
        System.out.println(name);

        boolean results = name.contains("g");
        System.out.println(results);

    }
}
