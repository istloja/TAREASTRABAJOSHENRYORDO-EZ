package ObjetosAnimales;

public class Aves extends Animales {

    private boolean vuelan;
    private int numero_huevos;

    public Aves(boolean vuelan, int numero_huevos) {
        this.vuelan = vuelan;
        this.numero_huevos = numero_huevos;
    }

    public Aves() {
    }

    public boolean isVuelan() {
        return vuelan;
    }

    public void setVuelan(boolean vuelan) {
        this.vuelan = vuelan;
    }

    public int getNumero_huevos() {
        return numero_huevos;
    }

    public void setNumero_huevos(int numero_huevos) {
        this.numero_huevos = numero_huevos;
    }
}

