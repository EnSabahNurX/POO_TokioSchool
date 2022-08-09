public class Conta {
    private String titular;
    private String numeroDeConta;
    private double quantidade;

    public Conta(String titular, String numeroDeConta, double quantidade) {
        this.titular = titular;
        this.numeroDeConta = numeroDeConta;
        this.quantidade = quantidade;
    }

    public static void comparaDinheiro(Conta a, Conta b) {
        if (a.getQuantidade() > b.getQuantidade()) {
            System.out.println("\nThe first account has bigger amount in balance than the second account.");
        } else if (a.getQuantidade() < b.getQuantidade()) {
            System.out.println("\nThe second account has bigger amount in balance than the first account.");
        } else {
            System.out.println("\nBoth accounts have the same amount in balance.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(String numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
