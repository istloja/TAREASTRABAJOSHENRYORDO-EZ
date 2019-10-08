package Ecepciones;

import java.util.Scanner;

public class EcepcionesEjemplo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = 0;
        try {//linea de codigo que voy a proteger
            numero = entrada.nextInt();
        } catch (Exception e) {//mensaje de presentar //
            System.out.println("Se ha generado la excepcion" + e);
//        } finally {//ejecutar la accion como si no hubiera pasado nada//se produce siempre que ocurre una ecepcion
            System.out.println("Ingrese un numero correcto:");
            numero = entrada1.nextInt();
        }
        System.out.println("El numero ingresado es:" + numero);
        try {
            int resultado = numero / 0;
            System.out.println("No ingrese letras con ecepciones:" + resultado);
        } catch (Exception e) {
            System.out.println("No se puede dividir para 0");
        }

    }
}
