package Conversor;

import java.util.Scanner;

public class Ejecutar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 1 m a Km \n ingrese 2 para m a Hec \n ingrese 3 para m a Dec \n ingrese 4 para m a dm \n ingrese 5 para m a cm \n ingrese 6 para m a mm ");
        int opc = entrada.nextInt();
        switch (opc) {
            case 1:
                Kilometros objeto = new Kilometros();
                System.out.println("Ingrese la cantidad en metros");
                double cant = entrada.nextDouble();
                System.out.println(objeto.CalcularM_Km(cant));
                break;
            case 2:
                Hectometros objeto1 = new Hectometros();
                System.out.println("Ingrese la cantidad en metros");
                double cant1 = entrada.nextDouble();
                System.out.println(objeto1.CalcularM_hectometros(cant1));
                break;
            case 3:
                Decimal objeto2 = new Decimal();
                System.out.println("Ingrese la cantidad en metros");
                double cant2 = entrada.nextDouble();
                System.out.println(objeto2.CalcularM_Dec(cant2));
                break;
            case 4:
                Decimetros objeto3 = new Decimetros();
                System.out.println("Ingrese la cantidad en metros");
                double cant3 = entrada.nextDouble();
                System.out.println(objeto3.CalcularM_deci(cant3));
                break;
            case 5:
                Centimetros objeto4 = new Centimetros();
                System.out.println("Ingrese la cantidad en metros");
                double cant4 = entrada.nextDouble();
                System.out.println(objeto4.CalcularM_cm(cant4));
                break;
            case 6:
                Milimetros objeto5 = new Milimetros();
                System.out.println("Ingrese la cantidad en metros");
                double cant5 = entrada.nextDouble();
                System.out.println(objeto5.CalcularM_mm(cant5));
                break;
        } //comentario
    }
}
