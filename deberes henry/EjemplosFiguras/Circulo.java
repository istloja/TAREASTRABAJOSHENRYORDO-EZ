package EjemplosFiguras;

public class Circulo extends FiguraBidimensional {

    public double calcularArea(double radio) {
        return radio * Math.pow(Math.PI, 2);
    }

    public double calcularPerimetro(double radio) {
        return radio * (2 * Math.PI);
    }
}
