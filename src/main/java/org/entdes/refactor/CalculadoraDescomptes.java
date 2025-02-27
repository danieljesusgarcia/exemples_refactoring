package org.entdes.refactor;

public class CalculadoraDescomptes {

    public int calcularDescompteComanda(int preu, int quantitat) {
        // Validar entrada
        if (preu <= 0 || quantitat <= 0) {
            return 0;
        }
        // Calcular descompte
        return (preu * quantitat) * 10 / 100;
    }

    public int calcularDescompteDevolucio(int preu, int quantitat) {
        // Validar entrada
        if (preu <= 0 || quantitat <= 0) {
            return 0;
        }
        // Calcular descompte
        return (preu * quantitat) * 5 / 100;
    }

    public static void main(String[] args) {
        CalculadoraDescomptes calc = new CalculadoraDescomptes();

        System.out.println("Descompte comanda: " + calc.calcularDescompteComanda(100, 5));
        System.out.println("Descompte devolució: " + calc.calcularDescompteDevolucio(100, 5));
    }
}


