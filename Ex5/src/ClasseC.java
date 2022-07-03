public class ClasseC extends ClasseA {
    // Pelo ao menos duas delas deve ser pai e filha.

    private final long renovacao;
    public int numeroCarta;
    protected char categoria;


    public ClasseC(int numeroCarta, long renovacao, char categoria, String nome, int idade, float altura) {
        super(nome, idade, altura);
        this.numeroCarta = numeroCarta;
        this.renovacao = renovacao;
        this.categoria = categoria;

    }
}
