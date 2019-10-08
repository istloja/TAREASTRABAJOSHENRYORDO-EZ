package ObjetosAnimales;

public class Mamiferos extends Animales {

    private double tiempo_gestacion;
    private boolean sangre_caliente;

    public Mamiferos() {
    }

    public Mamiferos(double tiempo_gestacion, boolean sangre_caliente) {
        this.tiempo_gestacion = tiempo_gestacion;
        this.sangre_caliente = sangre_caliente;
    }

    public double getTiempo_gestacion() {
        return tiempo_gestacion;
    }

    public void setTiempo_gestacion(double tiempo_gestacion) {
        this.tiempo_gestacion = tiempo_gestacion;
    }

    public boolean isSangre_caliente() {
        return sangre_caliente;
    }

    public void setSangre_caliente(boolean sangre_caliente) {
        this.sangre_caliente = sangre_caliente;
    }
}
