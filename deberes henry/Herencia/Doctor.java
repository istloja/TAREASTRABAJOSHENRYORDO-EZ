package Herencia;

public class Doctor {

    private String nombre;
    private String direccion;
    private int telefono;
    private int edad;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Area_laboral() {
        System.out.println("Doctor General");
    }

    public void Horas_trabajadas() {
        System.out.println("Su jornada es:" + 8 + "Horas");
    }

}
