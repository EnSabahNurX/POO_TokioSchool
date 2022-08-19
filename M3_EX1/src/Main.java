import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean valid = false;
        double temp;
        System.out.println("\nThis simple program is able to convert temperature between Celsius degrees and Fahrenheit degree.");
        System.out.println("\nType \"1\" if you want to convert Fahrenheit to Celsius.\nType \"2\" if you want to convert Celsius to Fahrenheit.");
        while (!valid) {
            try {
                option = Integer.parseInt(sc.nextLine());
                if (option >= 1 && option <= 2) {
                    valid = true;
                } else {
                    System.out.println("\nSorry, for now we have only two valid options, 1 or 2. Please try again.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nSorry, this is not a valid option. Please try again.\n");
            }
        }
        valid = false;
        if (option == 1) {
            System.out.println("\nAlright, now just type how many degrees in Fahrenheit you want to convert to Celsius:");
            while (!valid) {
                try {
                    temp = Double.parseDouble(sc.nextLine());
                    System.out.println("\n" + temp + " ºF converted to Celsius is "
                            + String.format("%.2f", Temperature.getToCelsius(temp)) + " ºC.");
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("\nSorry, this is not a valid degree. Please try again.\n");
                }
            }
        } else {
            System.out.println("\nAlright, now just type how many degrees in Celsius you want to convert to Fahrenheit:");
            while (!valid) {
                try {
                    temp = Double.parseDouble(sc.nextLine());
                    System.out.println("\n" + temp + " ºC converted to Fahrenheit is "
                            + String.format("%.2f", Temperature.getToFahrenheit(temp)) + " ºF.");
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("\nSorry, this is not a valid degree. Please try again.\n");
                }
            }
        }
        System.out.println("\nBy the way, this is a very interesting curiosity:\n\nThe melting point of pure water is "
                + Temperature.getMeltingPointC() + " ªC / " + Temperature.getMeltingPointF()
                + " ºF.\nThe boiling point of pure water is " + Temperature.getBoilingPointC() + " ªC / "
                + Temperature.getBoilingPointF() + " ºF.\n");
    }
}