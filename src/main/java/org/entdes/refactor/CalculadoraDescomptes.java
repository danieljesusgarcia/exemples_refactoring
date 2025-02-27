package org.entdes.refactor;

public class CalculadoraDescomptes {
    public boolean esValida(int preu, int quantitat) {
        if (preu <= 0 || quantitat <= 0) {
            return true;
        }
        return false;
    }

    public int calcularDescompteComanda(int preu, int quantitat) {
        // Validar entrada
        if (esValida(preu, quantitat)) {
            return 0;
        } 
        // Calcular descompte i Retornar Descompte
        return calcularDescompte(preu, quantitat, 10);
        
    }

    public int calcularDescompteDevolucio(int preu, int quantitat) {
        // Validar entrada
        if (esValida(preu, quantitat)) {
            return 0;
        } 
        // Calcular i retornar descompte
        return calcularDescompte(preu, quantitat, 5);
        
    }
    
    private  int calcularDescompte(int  preu, int quantitat, int descompte){
        return (preu * quantitat) * descompte / 100;
    }

    public static void main(String[] args) {
        CalculadoraDescomptes calc = new CalculadoraDescomptes();

        System.out.println("Descompte comanda: " + calc.calcularDescompteComanda(100, 5));
        System.out.println("Descompte devolució: " + calc.calcularDescompteDevolucio(100, 5));
    }
}


