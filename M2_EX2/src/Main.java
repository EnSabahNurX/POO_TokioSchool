import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 3; // limit the number of tries to type the access code
        String newPass = "";
        String toValidate = "";
        String temp = "";
        String confirm = "";
        System.out.println("\nTo have access into the system first you must create your passcode!\n\nPlease type a new password:");
        while (temp.isEmpty()) { // ask for a new password to register in the system
            temp = sc.nextLine();
            if (!temp.isEmpty()) {
                while (temp.compareTo(confirm) != 0) { // check if both password are equals
                    System.out.println("\nPlease, confirm the new password:");
                    confirm = sc.nextLine();
                    if (temp.compareTo(confirm) == 0) {
                        newPass = temp;
                        System.out.println("\nThe new password was created with success!\n");
                        break;
                    }
                    System.out.println("\nAttention! Both password must be the same. Please, try again.");
                }
                break;
            }
            System.out.println("\nWarning! the new password might be not empty! Please, try again.\n");
        }
        System.out.println("\n\nEnter the password to have access into the system:\nRemaining attempts: " + attempts + ".\n");
        while (toValidate.compareTo(newPass) != 0 && attempts > 0) { // begins the validation process
            toValidate = sc.nextLine();
            if (toValidate.compareTo(newPass) != 0) {
                attempts -= 1;
                System.out.println("\nError! Something is wrong with your access code. Please try again.\nRemaining attempts: " + attempts + ".\n");
                if (attempts == 0) {
                    System.out.println("\nAccess denied!\nTry again later. Bye.");
                }
                continue;
            }
            System.out.println("\nApproved access.\nWelcome to the system!\n");
            break;
        }
    }
}