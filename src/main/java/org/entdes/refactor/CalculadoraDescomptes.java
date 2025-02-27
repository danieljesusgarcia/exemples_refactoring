package org.entdes.refactor;

public class CalculadoraDescomptes {


    public int calcularDescompteComanda(int preu, int quantitat) {
        // Validar entrada
        if (!entradavalida(preu, quantitat)) {
            return 0;
        }
        return calculardescompte(preu, quantitat, 10);
    }

    public int calcularDescompteDevolucio(int preu, int quantitat) {
        // Validar entrada
        if (!entradavalida(preu, quantitat)) {
            return 0;
        }
        // Calcular descompte
        return calculardescompte(preu, quantitat, 5);
       
    }
    // He afegir els metodes privats entradavalida (per no repetir el codi de validar la entrada) i calculardescompte (per no repetir el codi de calcular el descompte)
    private boolean entradavalida(int preu, int quantitat) {
        return preu > 0 && quantitat > 0;
    }

    private int calculardescompte(int preu, int quantitat, int percentatge) {
        return (preu * quantitat) * percentatge / 100;
     }

    public static void main(String[] args) {
        CalculadoraDescomptes calc = new CalculadoraDescomptes();

        System.out.println("Descompte comanda: " + calc.calcularDescompteComanda(100, 5));
        System.out.println("Descompte devolució: " + calc.calcularDescompteDevolucio(100, 5));
    }
}


