public class Main {
    public static void main(String[] args) {
        Oven oven = new Oven();
        Pepperoni pizzaPepperoni = new Pepperoni();
        BeefAndOnion pizzaBeefAndOnion = new BeefAndOnion();
        Hawaiian pizzaHawaiian = new Hawaiian();

        System.out.println();
        oven.make(pizzaPepperoni);
        System.out.println();
        oven.make(pizzaBeefAndOnion);
        System.out.println();
        oven.make(pizzaHawaiian);
        System.out.println();
    }
}