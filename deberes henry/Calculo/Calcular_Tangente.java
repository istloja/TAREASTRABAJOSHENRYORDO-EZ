package Calculo;

public class Calcular_Tangente extends Calcular {

    double CalculoGrado2(double grados) {
        grados = Math.toRadians(grados);
        return grados;

    }

    double CalculoTangente(double valor) {
        valor = Math.sin(valor);
        return valor;
    }
}
