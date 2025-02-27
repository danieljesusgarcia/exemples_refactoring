package org.entdes.refactor;

public class CalculadoraDescomptes {

    public int calcularDescompteComanda(int preu, int quantitat) {
        // Validar entrada
        if(!validarEntrada(preu, quantitat))return 0; 
        // Calcular descompte
        return calcularDescompte(preu, quantitat, 10);
    }

    public int calcularDescompteDevolucio(int preu, int quantitat) {
        // Validar entrada
        if(!validarEntrada(preu, quantitat))return 0; 
        // Calcular descompte
        return calcularDescompte(preu, quantitat, 5);
    }

    
    public boolean validarEntrada(int preu, int quantitat){
        if (preu <= 0 || quantitat <= 0) return false;
        return true;
    }

    public int calcularDescompte (int preu, int quantitat, int num){
        int descompte = (preu * quantitat) * num / 100;
        return descompte;
    }

    
    
    public static void main(String[] args) {
        CalculadoraDescomptes calc = new CalculadoraDescomptes();

        System.out.println("Descompte comanda: " + calc.calcularDescompteComanda(100, 5));
        System.out.println("Descompte devolució: " + calc.calcularDescompteDevolucio(100, 5));
    }
}


