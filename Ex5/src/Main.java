public class Main {
    // Desde uma quarta classe principal, aceder a cada uma das variáveis das classes anteriores (A, B e C) de maneira
    // correta em função do modificador definido.

    public static void main(String[] args) {
        ClasseA pessoa;
        ClasseB carro;
        ClasseC condutor;

        pessoa = new ClasseA("Ricardo", 32, 1.77f);
        carro = new ClasseB("BMW", 2000, true);
        condutor = new ClasseC(1234, 20250414, 'B', "António", 30, 1.75f);

        System.out.println("Nome da pessoa: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());

    }
}
