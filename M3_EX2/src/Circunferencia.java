public class Circunferencia implements Poligono {
    public static final double pi = 3.14159265359;
    public double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(double raio) {
        return raio * raio * pi;
    }

    @Override
    public double calcularPerimetro(double raio) {
        return raio * 2 * pi;
    }
}