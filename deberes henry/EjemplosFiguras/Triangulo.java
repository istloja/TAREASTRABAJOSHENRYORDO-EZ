package EjemplosFiguras;

public class Triangulo extends FiguraBidimensional {

    public double calcularPerimitro(double lado1, double lado2, double lado3) {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public double calcularArea(double base, double altura) {
        area = (base * altura) / 2;

        return area;
    }
}
