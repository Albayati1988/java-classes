package class12;

import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {
         /* Store username, password and confirm password from a user and check following requirements:
 Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.
         Only after all requirements met → message “Your username and password has been created”*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Username");
        String name= input.nextLine();
        System.out.println("Please Enter your Password");
        String password = input.nextLine();
        System.out.println("Please confirm your Password");
        String confirm = input.nextLine();

        if (name.isEmpty() || password.isEmpty()){
            System.out.println("Username and Password can not be empty!");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(name)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirm)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your username and password has been created");
        }

    }
}
