public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro(String isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public static void comparaLivro(Livro a, Livro b) {
        if (a.getNumeroDePaginas() > b.getNumeroDePaginas()) {
            System.out.println("\nO livro " + a.getTitulo() + " é maior em relação ao número de páginas do que o livro " + b.getTitulo() + ".");
        } else if (a.getNumeroDePaginas() < b.getNumeroDePaginas()) {
            System.out.println("\nO livro " + b.getTitulo() + " é maior em relação ao número de páginas do que o livro " + a.getTitulo() + ".");
        } else {
            System.out.println("\nTanto o livro " + a.getTitulo() + " quanto o livro " + b.getNumeroDePaginas() + " possuem o mesmo número de páginas.");
        }
    }

    @Override
    public String toString() {
        return "\nO livro com título " + this.titulo + " e ISBN " + this.isbn + " e autor " + this.autor + " tem " + this.numeroDePaginas + " páginas.";
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
