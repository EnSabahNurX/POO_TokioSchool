public class ClasseB {
    private final boolean national;
    public String brand;
    protected int horsepower;

    public ClasseB(String brand, int horsepower, boolean national) {
        this.brand = brand;
        this.horsepower = horsepower;
        this.national = national;
    }

    @Override
    public String toString() {
        return "ClasseB{" +
                "national=" + national +
                ", brand='" + brand + '\'' +
                ", horsepower=" + horsepower +
                '}';
    }
}
