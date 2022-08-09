public class Table {
    public int number;

    public Table(int number) {
        this.number = number;
    }

    public void table(int number) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }
}
