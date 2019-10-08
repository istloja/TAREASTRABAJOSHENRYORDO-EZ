package DeberArchivosSerializables;

import java.io.Serializable;

public class Equipo implements Serializable {

    private String categoria;
    private int jugadores;
    private int numero_copas;
    private String nombre_equipo;
    private String numero_titulo;
    private String ciudad;

    public Equipo(String categoria, int jugadores, int numero_copas, String nombre_equipo, String numero_titulo, String ciudad) {
        this.categoria = categoria;
        this.jugadores = jugadores;
        this.numero_copas = numero_copas;
        this.nombre_equipo = nombre_equipo;
        this.numero_titulo = numero_titulo;
        this.ciudad = ciudad;
    }

    Equipo(String marlon, int i, String ecuador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public int getNumero_copas() {
        return numero_copas;
    }

    public void setNumero_copas(int numero_copas) {
        this.numero_copas = numero_copas;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public String getNumero_titulo() {
        return numero_titulo;
    }

    public void setNumero_titulo(String numero_titulo) {
        this.numero_titulo = numero_titulo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
