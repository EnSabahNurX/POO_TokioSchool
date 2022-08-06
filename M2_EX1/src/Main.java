import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object to get input from user
        double aritAvrg = 0;
        int total; // maximum of numbers to get the arithmetic mean by default
        System.out.println("\nHow many numbers to calculate the Arithmetic Mean?");
        try {
            total = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            total = 6;
            System.out.println("\nTotal of numbers was defined to 6 by default.\n");
        }
        int count = total;
        int current = 1;
        while (count > 0) { // loop to try to get information until the all numbers are valid
            System.out.println("\nType the number " + current + " of " + total + ":");
            String temp = sc.nextLine(); // waiting user to type number
            try { // if type a valid number this will change the sum/average
                aritAvrg += Double.parseDouble(temp); // convert the input into a number
                count -= 1;
                current += 1;
            } catch (NumberFormatException e) { // if receive an error/exception will ask to repeat
                System.out.println("Sorry, this is not a number. Please, try again.\n");
            }
        }
        aritAvrg /= total;
        System.out.println("\nThe arithmetic average is " + aritAvrg + ".\n");
    }
}