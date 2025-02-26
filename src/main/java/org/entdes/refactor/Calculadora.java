package org.entdes.refactor;

public class Calculadora {

    public int calcularAreaRectangle(int a, int b) {
        return multiplicar(a, b);
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
    
    public double calcularPreuFinal(double a, int b, double c) {
        double d = afegirImpostos(a, b);
        return aplicarDescompte(d, c);
    }



    private double afegirImpostos(double a, int b) {
        double c = 0;
        switch (b) {
            case 1:
                c = 0.21;
                break;
            case 2:
                c = 0.1;
                break;
            default:
                break;
        }
        return a + (a * c);
    }

    private double aplicarDescompte(double a, double b) {
        return a - (a * b);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Àrea: " + calc.calcularAreaRectangle(5, 10));
        System.out.println("Preu final general: " + calc.calcularPreuFinal(100, 1, 0.1));
        System.out.println("Preu final reduït: " + calc.calcularPreuFinal(100, 2, 0.1));
        System.out.println("És parell? " + calc.esNombreParell(8));
    }
}
