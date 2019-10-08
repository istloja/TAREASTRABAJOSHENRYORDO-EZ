package TareaJuego;

import java.io.InputStream;

public class JuegoAdivinarNumero {

    private static Scanner Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int vidas;
    int numero;

    public JuegoAdivinarNumero(int vidas, int numero) {
        this.vidas = vidas;
        this.numero = numero;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int reiniciarPartida() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Adivine un numero entre 0 y 10");
        int numero = (int) (Math.random() * 10);
        return numero;

    }

    public static void main(String[] args) {
        Scanner entrada = Scanner(System.in);
        int dato = 0;
    }

    private static class Scanner {

        public Scanner() {
        }

        private Scanner(InputStream in) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
