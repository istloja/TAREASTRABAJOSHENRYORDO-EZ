package Herencia;

public class Administrador {

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

    public void mostrar_horas_laborables() {
        System.out.println("Sus horas laborables son:" + 44);
    }

    public void dias_libres() {
        System.out.println("Sus dias libres son " + "Miercoles");
    }
}
