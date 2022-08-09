import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Table table;
        int number;
        try {
            System.out.println("\nPlease, tell me which number table you would like to see? If you don't say nothing or a invalid number it will be considered the table of 9, okay.");
            number = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            number = 9;
        }
        table = new Table(number);
        table.table(number);
    }
}