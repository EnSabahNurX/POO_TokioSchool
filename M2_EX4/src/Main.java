import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double squareSide;
        System.out.println("\nThis is a program to help you to calculate the area of square. Please inform bellow what the size of the square side:");
        squareSide = sc.nextDouble();
        Square quadrado = new Square(squareSide);
        System.out.println("\nThe area of the square informed above is " + quadrado.CalculateArea(squareSide) + ".");
    }
}