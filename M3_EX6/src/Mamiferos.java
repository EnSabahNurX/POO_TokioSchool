public class Mamiferos extends Animal {
    public Mamiferos() {
    }

    public void comer() {
        super.comer();
        System.out.println("Este animal pertence ao grupo dos mamíferos, é provável que se alimente de leite em algum momento da vida.");
    }
}
