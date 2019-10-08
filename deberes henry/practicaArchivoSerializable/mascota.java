package ArchivoSerializable;

import java.io.Serializable;

public class mascota implements Serializable {

    private String nombre;
    private int numero_patas;

    public mascota() {
    }

    public mascota(String nombre, int numero_patas) {
        this.nombre = nombre;
        this.numero_patas = numero_patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_patas() {
        return numero_patas;
    }

    public void setNumero_patas(int numero_patas) {
        this.numero_patas = numero_patas;
    }
}
