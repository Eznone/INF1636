import validation.*;
import security.*;

public class EX1501 {
    public static void main(String[] args) {
        // Initialize the authorization database
        DBAuthorization.init();
        
        // Create a new Checker object
        Checker checker = new Checker();

        // Test case 1: Correct code and password
        if (checker.check(22222, "bb")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        // Test case 2: Correct code, wrong password
        if (checker.check(22222, "wrong_password")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        // Test case 3: Maximum attempts exceeded
        if (checker.check(22222, "wrong_password")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}