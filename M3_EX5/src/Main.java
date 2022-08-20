public class Main {
    public static void main(String[] args) {
        ClasseA person;
        ClasseB car;
        ClasseC driver;

        person = new ClasseA("Ricardo", 32, 1.77f);
        car = new ClasseB("BMW", 2000, true);
        driver = new ClasseC(1234, 20250414, 'B', "António", 30, 1.75f);

        System.out.println("\nName: " + person.name);
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight() + "\n");
        System.out.println(driver);
        System.out.println(car);
    }
}