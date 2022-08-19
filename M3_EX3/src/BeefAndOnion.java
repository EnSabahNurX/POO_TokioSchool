public class BeefAndOnion implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Beef and Onion topped with mozzarella.");
    }

    @Override
    public void bake() {
        System.out.println("19 minutes to get ready..");
    }

    @Override
    public void price() {
        System.out.println("14 €.");
    }

    @Override
    public void crust() {
        System.out.println("Cheese Stuffed Crust.");
    }

    @Override
    public void extra() {
        System.out.println("Extra large");
    }
}
