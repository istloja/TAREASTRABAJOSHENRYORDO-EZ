package EJEMPLOS_DE_REPPASO_EXAMEN;

public class Ejercicio11 {

    public static void imprimirRepetidos(long number) {
        int[] cont = new int[10]; // Cuenta la cantidad de apariciones de cada digito
        int digito;
        while (number > 0) {
            digito = (int) (number % 10);
            cont[digito]++;
            number /= 10;
        }
        for (digito = 0; digito < 10; digito++) {
            if (cont[digito] > 1) {
                System.out.println("El digito " + digito + " se repite " + cont[digito] + " veces");
            }
        }
    }
}
