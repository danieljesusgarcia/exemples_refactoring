package org.entdes.refactor;

public class Calculadora {

    final Double IMPOSTGENERAL = 0.21;
    final Double IMPOSTREDUIT = 0.1;

    public int calcularAreaRectangle(int base, int altura) {
        return multiplicar(base, altura);
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    public boolean esNombreParell(int a) {
        return comprovarSiEsParell(a);
    }

    private boolean comprovarSiEsParell(int a) {
        return a % 2 == 0;
    }
    
    public double calcularPreuFinal(double preu, int tipusImpost, double descompte) {
        double preuFinal = afegirImpostos(preu, tipusImpost);
        return aplicarDescompte(preuFinal, descompte);
    }

    private double afegirImpostos(double preu, int tipusImpost) {
        switch (tipusImpost) {
            case 1:
                return preu + (preu * IMPOSTGENERAL);
            case 2:
                return preu + (preu * IMPOSTREDUIT);
            default:
                break;
        }
        return 0;
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
