# Cálculo de Área de Figuras Geométricas — Interfaces e Lambda em Java

Exercício prático de Programação Orientada a Objetos (POO) desenvolvido durante o Bootcamp da [DIO](https://www.dio.me/), com foco nos conceitos de **Interface Funcional** e **Expressões Lambda**.

## 📋 Descrição

O objetivo é calcular a área de diferentes figuras geométricas, cada uma com seus próprios atributos:

| Figura | Atributos |
|---|---|
| Quadrado | lado |
| Retângulo | base e altura |
| Círculo | raio |

## 🧱 Estrutura

### `FiguraGeometrica` (interface funcional)
```java
@FunctionalInterface
interface FiguraGeometrica {
    double calcularArea();
}
```
Único método abstrato, sem parâmetros — cada figura já guarda seus próprios dados e sabe calcular sua área sozinha.

### `Quadrado`, `Retangulo`, `Circulo`
Cada forma é uma classe que implementa `FiguraGeometrica`, guardando seus atributos específicos e implementando `calcularArea()` com a fórmula correspondente.

### Uso de Lambda no `Main`
Mesmo as figuras sendo classes, o Lambda aparece na hora de **operar sobre a lista**:

```java
// Percorrer e exibir cada figura, sem escrever um for manual
figuras.forEach(figura ->
    System.out.printf("%-20s | Área: %.2f%n", figura, figura.calcularArea())
);

// Ordenar por área, usando o próprio método calcularArea() como critério
figuras.sort(Comparator.comparingDouble(FiguraGeometrica::calcularArea));
```

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Sandro-ia/CalculoAreaGeometrica.git
   ```
2. Abra o projeto no IntelliJ IDEA (ou outra IDE Java de sua preferência).
3. Execute a classe `Main.java`.

**Saída esperada:**
```
=== Áreas calculadas ===
Quadrado (lado=4.0)                | Área: 16,00
Retângulo (base=5.0, altura=3.0)   | Área: 15,00
Círculo (raio=2.0)                 | Área: 12,57

=== Ordenadas da menor para a maior área ===
Círculo (raio=2.0)                 | Área: 12,57
Retângulo (base=5.0, altura=3.0)   | Área: 15,00
Quadrado (lado=4.0)                | Área: 16,00
```

## 🛠️ Tecnologias

- Java

## ✍️ Autor

Desenvolvido por [Sandro](https://github.com/Sandro-ia) durante o Bootcamp DIO.
