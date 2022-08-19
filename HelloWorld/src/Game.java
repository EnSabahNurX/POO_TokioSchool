public class Game {
    public int id;
    public String name;
    public int year_release;
    public String genre;
    public String platform;
    public int players;
    public boolean online;

    public Game() {
        this.id = -1;
        this.name = "Undefined";
        this.year_release = 2000;
        this.genre = "Undefined";
        this.platform = "Undefined";
        this.players = 1;
        this.online = false;
    }

    public Game(int id, String name, int year_release, String genre, String platform, int players, boolean online) {
        this.id = id;
        this.name = name;
        this.year_release = year_release;
        this.genre = genre;
        this.platform = platform;
        this.players = players;
        this.online = online;
    }

    public void updateGame(int id, String name, int year_release, String genre, String platform, int players, boolean online) {
        this.id = id;
        this.name = name;
        this.year_release = year_release;
        this.genre = genre;
        this.platform = platform;
        this.players = players;
        this.online = online;
    }

    public void updateGame(int id, String name, int year_release, String genre, String platform, int players) {
        this.id = id;
        this.name = name;
        this.year_release = year_release;
        this.genre = genre;
        this.platform = platform;
        this.players = players;
    }

    public void updateGame(int id, String name, int year_release, String genre, String platform) {
        this.id = id;
        this.name = name;
        this.year_release = year_release;
        this.genre = genre;
        this.platform = platform;
    }

    public void updateGame(int id, String name, int year_release, String genre) {
        this.id = id;
        this.name = name;
        this.year_release = year_release;
        this.genre = genre;
    }

    public void updateGame(int id, String name, int year_release) {
        this.id = id;
        this.name = name;
        this.year_release = year_release;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year_release=" + year_release +
                ", genre='" + genre + '\'' +
                ", platform='" + platform + '\'' +
                ", players=" + players +
                ", online=" + online +
                '}';
    }
}
