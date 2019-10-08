package EJEMPLOS_DE_REPPASO_EXAMEN;

public class NumerosDeA {

    public int numerodepalabras(String cadena) {
        String caracter = "a";
        int numeroveces = 0;
        String palabras[] = cadena.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].contains(caracter)) {
                numeroveces++;
            }
        }
        return numeroveces;
    }

    public static void main(String[] args) {
        NumerosDeA obj = new NumerosDeA();

        System.out.println(obj.numerodepalabras("soy castillo"));
    }
}
