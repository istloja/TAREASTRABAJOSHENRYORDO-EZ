package TareaJuego;

public class JuegoAdivinar extends JuegoAdivinarNumero {

    public JuegoAdivinar(int vidas, int numero) {
        super(vidas, numero);
    }

    public double validaNumero() {
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
            System.out.println(true);
        } else {
            System.out.println("El numero es impar");
            System.out.println(false);

        }
        return numero;

    }
}
