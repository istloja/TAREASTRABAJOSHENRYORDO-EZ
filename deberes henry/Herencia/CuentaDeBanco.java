package Herencia;

public class CuentaDeBanco {

    public String Dueño;
    public float Dolares;

    public String getDueño() {
        return Dueño;
    }

    public void setDueño(String Dueño) {
        this.Dueño = Dueño;
    }

    public float getDolares() {
        return Dolares;
    }

    public void setDolares(float Dolares) {
        this.Dolares = Dolares;
    }

    public void Actualizacion_de_Saldo() {
        System.out.println("Su saldo esta actualizado");
    }

    public void Saldo_en_dolares() {
        System.out.println("Su saldo es:" + 22 + "Dolares");
    }

}
