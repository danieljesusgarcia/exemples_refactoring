package org.entdes.refactor;

public class CalculadoraDescomptes {
    
    public boolean isZero(int a, int b){
        if (a <= 0 || b <= 0) {
            return false;
        }
        return true;
    }

    public int calcularDescompte(int preu, int quantitat, int descompte){
        return (preu * quantitat) * descompte / 100;
    }

    public int calcularDescompteComanda(int preu, int quantitat) {
        // Validar entrada
        if (isZero(preu, quantitat)) {
            return 0;
        }
        // Calcular descompte
        return calcularDescompte(preu, quantitat, 10);
    }

    public int calcularDescompteDevolucio(int preu, int quantitat) {
        // Validar entrada
        if (isZero(preu, quantitat)) {
            return 0;
        }
        // Calcular descompte
        return calcularDescompte(preu, quantitat, 5);
    }

    public static void main(String[] args) {
        CalculadoraDescomptes calc = new CalculadoraDescomptes();

        System.out.println("Descompte comanda: " + calc.calcularDescompteComanda(100, 5));
        System.out.println("Descompte devolució: " + calc.calcularDescompteDevolucio(100, 5));
    }
}


