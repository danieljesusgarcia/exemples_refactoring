package org.entdes.refactor;

public class Calculadora {

    private static final double IMPOST_GENERAL = 0.21;
    private static final double IMPOST_REDUIT = 0.1;

    public int calcularAreaRectangle(int base, int altura) {
        return base * altura;
    }

    public boolean esNombreParell(int num) {
        return num % 2 == 0;

    }

    public double calcularPreuFinal(double preuBase, int numImpostos, double percentatgeDescompte) {
        double preuImpost = afegirImpostos(preuBase, numImpostos);
        return aplicarDescompte(preuImpost, percentatgeDescompte);
    }

    private double afegirImpostos(double base, int tipusImpost) {
        double descompte = 0;
        switch (tipusImpost) {
            case 1:
                descompte = IMPOST_REDUIT;
                break;
            case 2:
                descompte = IMPOST_GENERAL;
                break;
        }
        return base + (base * descompte);
    }

    private double aplicarDescompte(double preu, double descompte) {
        return preu - (preu * descompte);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Àrea: " + calc.calcularAreaRectangle(5, 10));
        System.out.println("Preu final general: " + calc.calcularPreuFinal(100, 1, 0.1));
        System.out.println("Preu final reduït: " + calc.calcularPreuFinal(100, 2, 0.1));
        System.out.println("És parell? " + calc.esNombreParell(8));
    }
}
