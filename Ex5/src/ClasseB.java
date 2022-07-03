public class ClasseB {
    // Desenvolver 3 classes (A, B e C) definindo em cada uma delas, pelo menos, 3 tipos de variáveis com 3
    // modificadores de acesso diferentes.

    private final boolean nacional;
    public String marca;
    protected int cilindrada;

    public ClasseB(String marca, int cilindrada, boolean nacional) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.nacional = nacional;
    }
}
