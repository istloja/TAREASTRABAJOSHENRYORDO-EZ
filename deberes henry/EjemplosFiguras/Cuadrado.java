package EjemplosFiguras;

public class Cuadrado extends FiguraBidimensional {

    public double calcularArea(double lado) {

        return Math.pow(lado, 2);
    }

    public double calcularPerimetro(double lado) {

        return lado + lado + lado + lado;
    }
}
