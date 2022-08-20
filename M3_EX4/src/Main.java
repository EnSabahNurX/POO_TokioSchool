import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca;
        String modelo;
        int RAM;
        int HD;
        int amount;
        System.out.println("\nLet's add a PC to your list, alright?");
        System.out.println("\nHow many PCs would you like to add now? (1 PC by default)");
        try {
            amount = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            amount = 1;
        }
        PC[] PCList = new PC[amount];
        for (int i = 0; i < amount; i++) {
            System.out.print("\nBrand: ");
            marca = sc.nextLine();
            System.out.print("\nModel: ");
            modelo = sc.nextLine();
            System.out.print("\nRAM: ");
            RAM = Integer.parseInt(sc.nextLine());
            System.out.print("\nHD: ");
            HD = Integer.parseInt(sc.nextLine());
            PCList[i] = new PC(marca, modelo, RAM, HD);
            System.out.println("\nPC was added with success!");
            System.out.println(PCList[i].toString() + "\n");
        }
        System.out.println("\nFollow bellow the full list of PCs:\n");
        for (int i = 0; i < PCList.length; i++) {
            System.out.println((i + 1) + "º - " + PCList[i].toString());
        }
    }
}