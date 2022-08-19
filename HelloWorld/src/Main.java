import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int year_release;
        String genre;
        String platform;
        int players;
        boolean online = false;
        System.out.println("\nLet's add a game to your library, alright?");
        System.out.println("\nHow many game would you like to add now? (1 game by default)");
        int amountGame;
        try {
            amountGame = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            amountGame = 1;
        }
        Game[] gameList = new Game[amountGame];
        for (int i = 0; i < amountGame; i++) {
            System.out.print("\nGame name: ");
            name = sc.nextLine();
            System.out.print("\nYear of release: ");
            year_release = Integer.parseInt(sc.nextLine());
            System.out.print("\nCategory: ");
            genre = sc.nextLine();
            System.out.print("\nGame platform: ");
            platform = sc.nextLine();
            System.out.print("\nHow many players: ");
            players = Integer.parseInt(sc.nextLine());
            System.out.print("\nGame has online option? ");
            String opt = sc.nextLine().toLowerCase();
            if (opt.equals("yes") || opt.equals("sim")) {
                online = true;
            }
            gameList[i] = new Game(i, name, year_release, genre, platform, players, online);
            System.out.println("Game " + name + " was added with success!");
            System.out.println(gameList[i].toString());
        }
        System.out.println("\nNow that you have a game library, tell the ID of which game you wanna update the info:");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("\nNew name:");
        name = sc.nextLine();
        System.out.print("\nNew year of release: ");
        year_release = Integer.parseInt(sc.nextLine());
        System.out.print("\nNew category: ");
        genre = sc.nextLine();
        System.out.print("\nNew game platform: ");
        platform = sc.nextLine();
        System.out.print("\nNew amount of players: ");
        players = Integer.parseInt(sc.nextLine());
        System.out.print("\nGame has online option?: ");
        String opt = sc.nextLine().toLowerCase();
        if (opt.equals("yes") || opt.equals("sim")) {
            online = true;
        }
    }
}