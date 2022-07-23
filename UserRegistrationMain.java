
import java.util.ArrayList;
import java.util.Scanner;

public class UserRegistrationMain {


    public static void main(String[] args) {
        System.out.println("Welcome to User Registration using regex program");
        UserRegistrationTest validate = new UserRegistrationTest();
        Scanner scan = new Scanner(System.in);
        System.out.println("1.To Validate the First name.");
        System.out.println("2.To Validate the Last Name.");
        System.out.println("3.TO Validate Email id");
        System.out.println("4.To Validate Mobile Number");
        System.out.println("5.To Validate Password");
        System.out.println("6.To Validate all emails list");
        System.out.println("Enter the option number to perform the operation");
        int option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the First Name(Note: First letter should be capital): ");
                String firstName = scan.next();
                validate.validateFirstName(firstName);
                break;
            case 2:
                System.out.println("Enter the Last name(Note:First letter should be capital): ");
                String lastName = scan.next();
                validate.validateLastName(lastName);
                break;
            case 3:
                System.out.println("Enter the email id: ");
                String email = scan.next();
                validate.validateEmail(email);
                break;
            case 4:
                System.out.println("Enter the Mob no: ");
                scan.nextLine();
                String input = scan.nextLine();
                validate.validateMobNumber(input);
                break;
            case 5:
                System.out.println("Enter the Password. Note: minimum 8 characters should be given");
                String password = scan.next();
                validate.validatePassword(password);
                break;
            case 6:
                System.out.println("Validating all samples emails list");
                String[] emails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                        "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com",
                        "abc@gmail.com.com", "abc+100@gmail.com", "abc123@gmail.a", "abc123@.com.com"};
                UserRegistrationTest.validateEmailsList(emails);
                break;
            default:
                System.out.println("Please Enter valid option to validate the pattern");
                break;
        }
    }
}
