package ex_07_User_Input;

public class Lab001_User_Age_Classification {
    // A user input will give you an age.
    // We need to check if the user is minor, adult or senior citizen.

    public static void main(String[] args) {
        // User will give input via the commandline.
        String user_age_input = args[0];
        int user_age = Integer.parseInt(user_age_input); // 25

        String result = (user_age < 18) ? "Minor" : (user_age <= 60) ? "Adult" : "Sr.Citizen";
        System.out.println("User is: " +result);


    }
}