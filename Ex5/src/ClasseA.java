public class ClasseA {
    // Desenvolver 3 classes (A, B e C) definindo em cada uma delas, pelo menos, 3 tipos de variáveis com 3
    // modificadores de acesso diferentes.


    private final float altura;
    public String nome;

    protected int idade;

    public ClasseA(String nome, int idade, float altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
}