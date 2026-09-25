public class Circulo implements FiguraGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Círculo (raio=" + raio + ")";
    }
}
