public class PC {
    private final String marca;
    private final String modelo;
    private final int RAM;
    private final int HD;

    public PC(String marca, String modelo, int RAM, int HD) {
        this.marca = marca;
        this.modelo = modelo;
        this.RAM = RAM;
        this.HD = HD;
    }

    @Override
    public String toString() {
        return "PC{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", RAM=" + RAM +
                ", HD=" + HD +
                '}';
    }
}
