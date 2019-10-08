package Calculo;

import java.util.Scanner;

public class Presentar {

    private static double valor;
    private static double grados;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige la funcion trigonometrica: \n 1 para Seno \n 2 para Coseno \n 3 para Tangente");
        int res = entrada.nextInt();
        switch (res) {
            case 1:
                Calcular_Seno objeto = new Calcular_Seno();
                System.out.println("Ingrese el valor");
                double grado = entrada.nextDouble();
                double valor = entrada.nextDouble();
                System.out.println("El grado es " + objeto.CalculoGrados(grado));
                System.out.println("El valor de seno es " + objeto.CalculoSeno(valor));
                break;
            case 2:
                Calcular_Coseno objeto1 = new Calcular_Coseno();
                System.out.println("Ingrese el valor");
                double grado1 = entrada.nextDouble();
                double valor1 = entrada.nextDouble();
                System.out.println("El grado es " + objeto1.CalculoGrado1(grado1));
                System.out.println("El valor de seno es " + objeto1.CalculoCoseno(valor1));
                break;
            case 3:
                Calcular_Tangente objeto2 = new Calcular_Tangente();
                System.out.println("Ingrese el valor");
                double grado2 = entrada.nextDouble();
                double valor2 = entrada.nextDouble();
                System.out.println("El grado es " + objeto2.CalculoGrado2(grado2));
                System.out.println("El valor de seno es " + objeto2.CalculoTangente(valor2));
                break;
        }
    }

}
