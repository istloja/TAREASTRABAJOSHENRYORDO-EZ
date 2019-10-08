package Herencia;

public class CuentaDeAhorro extends CuentaDeBanco {

    public static void main(String[] args) {
        CuentaDeAhorro objeto = new CuentaDeAhorro();
        objeto.setDueño("Dayana");
        System.out.println(objeto.getDueño());
        objeto.prueba();

    }
    private float interes_anual_por_ahorra;

    public float getInteres_anual_por_ahorra() {
        return interes_anual_por_ahorra;
    }

    public void setInteres_anual_por_ahorra(float interes_anual_por_ahorra) {
        this.interes_anual_por_ahorra = interes_anual_por_ahorra;
    }

    public void Actualizacion_de_Saldo() {
        System.out.println("No dispone de saldo en su cuenta");
    }

    public void prueba() {
        Actualizacion_de_Saldo();
        super.Actualizacion_de_Saldo();
    }

}
