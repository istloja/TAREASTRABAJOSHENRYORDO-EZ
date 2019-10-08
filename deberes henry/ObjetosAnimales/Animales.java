package ObjetosAnimales;

public class Animales {

    private String nombre;
    private double peso;
    private String color;
    private double altura;

    public Animales() {
    }

    public Animales(String nombre, double peso, String color, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.color = color;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;

    }

    public void alimentar() {
        System.out.println("Soy " + nombre + " y me alimento");
    }

    public String InformacionAnimal() {
        String cadena = "Soy un " + nombre + "Mi peso es: " + peso + "mi color es: " + color;
        return cadena;
    }
}
