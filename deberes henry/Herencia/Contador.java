package Herencia;

public class Contador extends Concesionario {

    public static void main(String[] args) {
        Contador objeto = new Contador();
        objeto.setNombre("Victoria");
        System.out.println(objeto.getNombre());
        objeto.prueba();

    }
    public String rango;
    public String seguro;
    public int horas_laboradas;

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public int getHoras_laboradas() {
        return horas_laboradas;
    }

    public void setHoras_laboradas(int horas_laboradas) {
        this.horas_laboradas = horas_laboradas;
    }

    public void Dias_de_atencion() {
        System.out.println("Los dias de atencion son:" + "Lunes\n" + "a\n" + "Sabado\n");
    }

    public void prueba() {
        Dias_de_atencion();
        super.Dias_de_atencion();
    }
}
