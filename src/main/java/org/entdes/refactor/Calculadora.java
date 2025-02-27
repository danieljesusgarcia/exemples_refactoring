package org.entdes.refactor;

public class Calculadora {

    public int calcularAreaRectangle(int base, int altura) {
        return altura * altura;
    }

    public boolean esNombreParell(int num) {
        return num % 2 == 0;

    }

    public double calcularPreuFinal(double preuBase, int numImpostos, double percentatgeDescompte) {
        double d = afegirImpostos(preuBase, numImpostos);
        return aplicarDescompte(d, percentatgeDescompte);
    }

    private double afegirImpostos(double base, int impost) {
        double c = 0;
        switch (impost) {
            case 1:
                c = 0.21;
                break;
            case 2:
                c = 0.1;
                break;
        }
        return base + (base * c);
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
