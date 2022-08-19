public class Pepperoni implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Pepperoni topped with mozzarella.");
    }

    @Override
    public void bake() {
        System.out.println("15 minutes to get ready.");
    }

    @Override
    public void price() {
        System.out.println("12 €.");
    }

    @Override
    public void crust() {
        System.out.println("Deep pan.");
    }

    @Override
    public void extra() {
        System.out.println("Cheese Stuffed Crust.");
    }
}