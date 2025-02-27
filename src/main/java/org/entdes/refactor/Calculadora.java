package org.entdes.refactor;

public class Calculadora {

    private static final double IVA_GENERAL = 0.21;
    private static final double IVA_REDUIT = 0.10;

    // Calcula l'àrea d'un rectangle
    public int calcularAreaRectangle(int amplada, int alcada) {
        return amplada * alcada;
    }

    // Comprova si un número és parell
    public boolean esParell(int numero) {
        return numero % 2 == 0;
    }
    
    // Calcula el preu final amb impostos i descompte
    public double calcularPreuFinal(double preuBase, int tipusIVA, double descompte) {
        double preuAmbIVA = afegirImpostos(preuBase, tipusIVA);
        return aplicarDescompte(preuAmbIVA, descompte);
    }

    // Afegeix els impostos segons el tipus d'IVA
    private double afegirImpostos(double preuBase, int tipusIVA) {
        double percentatgeIVA = (tipusIVA == 1) ? IVA_GENERAL : IVA_REDUIT;
        return preuBase + (preuBase * percentatgeIVA);
    }

    // Aplica el descompte al preu
    private double aplicarDescompte(double preu, double percentatgeDescompte) {
        return preu - (preu * percentatgeDescompte);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Àrea: " + calc.calcularAreaRectangle(5, 10));
        System.out.println("Preu final general: " + calc.calcularPreuFinal(100, 1, 0.1));
        System.out.println("Preu final reduït: " + calc.calcularPreuFinal(100, 2, 0.1));
        System.out.println("És parell? " + calc.esParell(8));
    }
}
