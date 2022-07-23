import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    UserInformation storePattern = new UserInformation();

    public void validateFirstName(String firstName) {
        UserInformation store = new UserInformation();
        store.setFirstName("^[A-Z]{1}[a-z]{3,}$");
        String first = store.getFirstName();
        store.validatingInput(firstName, first, "FirstName");
    }

    public void validateLastName(String lastName) {
        UserInformation f = new UserInformation();
        f.setLastName("^[A-Z]{1}[a-z]{3,}$");
        String last = f.getLastName();
        f.validatingInput(lastName, last, "LastName");
    }

    public void validateEmail(String email) {
        UserInformation storePattern = new UserInformation();
        storePattern.setEmail("[a-zA-z0-9]{2,}[_]@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}");
        storePattern.validatingInput(email, email, "Email");

    }

    public void validateMobNumber(String number) {
        storePattern.setMobileNumber("^[0-9]{2}\s?[6-9]{1}[0-9]{9}");
        String mobPattern = storePattern.getMobileNumber();
        storePattern.validatingInput(number, mobPattern, "Mobile Number");
    }

    public void validatePassword(String password){
        storePattern.setPasswordPattern("^[A-Z]{1}?:[a-zA-Z][_]@.[0-9]{7,}$");
        String passPattern= storePattern.getPasswordPattern();
        storePattern.validatingInput(password,passPattern,"Password");
    }
    public static void validateEmailsList(String[] emails) {
        for (int i = 0; i <= emails.length; i++) {
            Pattern pattern = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@][a-z0-9]+[.][a-z]+[.]?[a-z]+$");
            Matcher matcher = pattern.matcher(emails[i]);
            if (matcher.matches()) {
                System.out.println(emails + " : This Email id is valid");
            } else {
                System.out.println(emails + " : This Email id is Invalid");
            }
        }
    }
}
