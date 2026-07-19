package ex_10_Switch_Statement_;

import java.util.Scanner;

public class Lab003_Switch_statement_RealLife_UseCase {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = input.next();
        browser = browser.toLowerCase(); //converts the string into lower case

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }
    }
}
