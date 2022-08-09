import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titular;
        String numeroDeConta;
        double quantidade;
        int limit = 2;

        Conta[] accounts = new Conta[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("\nFilling information about the account " + (i + 1) + ".");
            System.out.println("\nName:");
            titular = sc.next();
            System.out.println("\nAccount number:");
            numeroDeConta = sc.next();
            System.out.println("\nTotal Amount:");
            quantidade = sc.nextDouble();
            accounts[i] = new Conta(titular, numeroDeConta, quantidade);
        }
        Conta.comparaDinheiro(accounts[0], accounts[1]);
    }
}