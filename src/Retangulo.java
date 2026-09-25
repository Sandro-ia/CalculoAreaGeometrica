public class Retangulo implements FiguraGeometrica {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base = base * altura;
    }

    @Override
    public String toString() {
        return "Retângulo (base=" + base + ", altura=" + altura + ")";
    }
}
