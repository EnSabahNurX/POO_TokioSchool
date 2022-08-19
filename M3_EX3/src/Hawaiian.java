public class Hawaiian implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Ham, pineapple and mozzarella.");
    }

    @Override
    public void bake() {
        System.out.println("16 minutes to get ready..");
    }

    @Override
    public void price() {
        System.out.println("13 €.");
    }

    @Override
    public void crust() {
        System.out.println("Perfecto.");
    }

    @Override
    public void extra() {
        System.out.println("Extra large");
    }
}
