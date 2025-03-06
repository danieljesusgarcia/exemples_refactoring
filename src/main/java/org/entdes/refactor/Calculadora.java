package org.entdes.refactor;

public class Calculadora {

    private static final double IMPOST_GENERAL = 0.21;
    private static final double IMPOST_REDUIT = 0.21;

    public int calcularAreaRectangle(int altura, int base) {
        return altura * base;
    }

    

    public boolean esNombreParell(int nombre) {
        return nombre % 2 == 0;
    }

        
    public double calcularPreuFinal(double preu, int impost, double descompte) {
        double preuTotalAmbImpostos = afegirImpostos(preu, impost);
        return aplicarDescompte(preuTotalAmbImpostos, descompte);
    }



    private double afegirImpostos(double quantitatBase, int tipusImpost) {
        double impostPercentage = 0;
        switch (tipusImpost) {
            case 1:
                impostPercentage = IMPOST_GENERAL;
                break;
            case 2:
                impostPercentage = IMPOST_REDUIT;
                break;
        }
        return quantitatBase + (quantitatBase * impostPercentage);
    }

    private double aplicarDescompte(double preuOriginal, double descomptePercentatge) {
        return preuOriginal - (preuOriginal * descomptePercentatge);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Àrea: " + calc.calcularAreaRectangle(5, 10));
        System.out.println("Preu final general: " + calc.calcularPreuFinal(100, 1, 0.1));
        System.out.println("Preu final reduït: " + calc.calcularPreuFinal(100, 2, 0.1));
        System.out.println("És parell? " + calc.esNombreParell(8));
    }
}
