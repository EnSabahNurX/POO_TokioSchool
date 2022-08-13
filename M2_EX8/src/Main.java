import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        int min = 0;
        int max = 100;
        int number = -1;
        System.out.println("\nCome on, let's check if a number is a prime or not, just type bellow any number between " + (min + 1) + " and " + (max - 1) + ":");
        while (!valid) {
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number > min && number < max) {
                    valid = true;
                } else {
                    System.out.println("We know that you are excited to check a lot of numbers, right? But for now let's keeping the range between " + (min + 1) + " and " + (max - 1) + ", please try again:");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nSorry, this is not a valid number between " + (min + 1) + " and " + (max - 1) + ". Please try again.\n");
            }
        }
        if (isPrime(number)) {
            System.out.println("Challenge accepted, this number was verified as a \"prime\" number.");
        } else {
            System.out.println("Challenge accepted, this number was verified as a \"non prime\" number.");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2 + 1; i < number; i++) { //check if is divisible by any number beside 1 and itself
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}