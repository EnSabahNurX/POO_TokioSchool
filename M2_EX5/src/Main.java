import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number;
        boolean valid = false;
        System.out.println("\nLet's check if a number is positive or negative. Just give a try and type any number bellow:");
        while (!valid) {
            try {
                number = Double.parseDouble(sc.nextLine());
                if (number < 0) {
                    System.out.println("\nAlright, this number is negative!");
                } else if (number > 0) {
                    System.out.println("\nAlright, this number is positive!");
                } else {
                    System.out.println("\nAlright, you just typed zero, you may consider also a positive number!");
                }
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("\nSorry, you did not typed a valid number. Please try again.\n");
            }
        }
    }
}