import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = new ArrayList<>(List.of(
                new Quadrado(4),
                new Retangulo(5, 3),
                new Circulo(2)

        ));

        System.out.println("===== Áreas Calculadas =====");

        figuras.forEach(figura ->
                System.out.printf("%-20s | Área: %.2f%n", figura, figura.calcularArea()));

        System.out.println("\n===== Ordenadas da menor para a maior área =====");

        figuras.sort(Comparator.comparingDouble(FiguraGeometrica::calcularArea));

        figuras.forEach(figura ->
                System.out.printf("%-20s | Área: %.2f%n", figura, figura.calcularArea()));
    }
}
