package org.entdes.refactor;

public class CalculadoraDescomptes {

    public int calcularDescompteComanda(int preu, int quantitat) {
        // Validar entrada
        if (validarDescompte(preu, quantitat)) return 0;
        // Calcular descompte
        int descompte = (preu * quantitat) * 10 / 100;
        // Retornar descompte
        return calcularDescompte(preu, quantitat, descompte);
    }

    public int calcularDescompteDevolucio(int preu, int quantitat) {
        // Validar entrada
        if (validarDescompte(preu, quantitat)) return 0;
        // Calcular descompte
        int descompte = (preu * quantitat) * 5 / 100;
        // Retornar descompte
        return calcularDescompte(preu, quantitat, descompte);
    }

    private int calcularDescompte(int preu, int quantitat, int descompte) {
        return (preu * quantitat) * descompte / 100;
    }

    private boolean  validarDescompte(int preu, int quantitat) {
        if (preu <= 0 || quantitat <= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CalculadoraDescomptes calc = new CalculadoraDescomptes();

        System.out.println("Descompte comanda: " + calc.calcularDescompteComanda(100, 5));
        System.out.println("Descompte devolució: " + calc.calcularDescompteDevolucio(100, 5));
    }
}


