package Herencia;

public class Concesionario {

    private String nombre;
    private String direccion;
    private int telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void Dias_de_atencion() {
        System.out.println("Los dias de atencion son:" + "Lunes\n" + "Martes\n" + "Miercoles\n" + "Jueves\n" + "Viernes\n" + "Sabado\n");

    }

    public void Horario_de_atencion() {
        System.out.println("El horario es:" + 9 + "/" + 17 + "horas");
    }

}
