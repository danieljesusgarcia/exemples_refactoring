package org.entdes.refactor;

public class CalculadoraDescomptes {

    public int calcularDescompteComanda(int preu, int quantitat) {
        // Validar entrada
        validarDescompte(preu, quantitat);
        // Calcular descompte
        int descompte = (preu * quantitat) * 10 / 100;
        // Retornar descompte
        return descompte;
    }

    public int calcularDescompteDevolucio(int preu, int quantitat) {
        // Validar entrada
        validarDescompte(preu, quantitat);
        // Calcular descompte
        int descompte = (preu * quantitat) * 5 / 100;
        // Retornar descompte
        return descompte;
    }

    private int validarDescompte(int preu, int quantitat) {
        if (preu <= 0 || quantitat <= 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        CalculadoraDescomptes calc = new CalculadoraDescomptes();

        System.out.println("Descompte comanda: " + calc.calcularDescompteComanda(100, 5));
        System.out.println("Descompte devolució: " + calc.calcularDescompteDevolucio(100, 5));
    }
}


