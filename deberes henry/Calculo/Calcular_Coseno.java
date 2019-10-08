package Calculo;

import static Calculo.Calcular.grados;

public class Calcular_Coseno extends Calcular {

    double CalculoGrado1(double grado) {
        grados = Math.toRadians(grados);
        return grados;
    }

    double CalculoCoseno(double valor) {

        valor = Math.sin(valor);
        return valor;

    }
}
