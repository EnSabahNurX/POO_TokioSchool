public class Main {
    public static void main(String[] args) {
        Livro livroA = new Livro("4532KLJSFD", "Linguagem java, só o que interessa!", "João Silva", 346);
        System.out.println(livroA + "\n");
        Livro livroB = new Livro("9867FSDFK8", "Programação Orientada a Objeto descomplicada", "Manoel Carvalho", 148);
        System.out.println(livroB + "\n");
        Livro.comparaLivro(livroA, livroB);
    }
}