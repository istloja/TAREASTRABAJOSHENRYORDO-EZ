package ProyectoClass;

import java.util.Scanner;

public class Caracter {

    public static void main(String[] args) {

        /*System.out.println("No es importante");// sirve para saludar al ususario
        /*
        System.out.println("No es importante");
        System.out.println("No es importante");
        System.out.println("No es importante");
        System.out.println("No es importante");
        System.out.println("No es importante");
        System.out.println("No es importante");
        System.out.println("No es importante");
        System.out.println("No es importante");
        System.out.println("No es importante");
         */
 /*byte num;*/
 /*int num=12465;
 
        System.out.println("El numero es:"+ num);
        float decimal = 3.45f;
        decimal = decimal + 4;
        System.out.println("El resultado es:" + decimal);
        char caracter = 'a';
        System.out.println("El caracter es:"+ caracter);
        boolean verd = true;
        System.out.println("La respuesta es:"+verd);
        String nombre="carlos";
        System.out.println("El nombre es:"+nombre);*/
        double a, b, resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese  a:");
        a = entrada.nextDouble();
        System.out.println("Ingrese b");
        b = entrada.nextDouble();
        resultado = a + b;
        System.out.println("El resultado es:" + resultado);
    }
}
