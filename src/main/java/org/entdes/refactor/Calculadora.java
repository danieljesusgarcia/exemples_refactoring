package org.entdes.refactor;

public class Calculadora {

    private static final double IMPOST_GENERAL = 0.21;
    private static final double IMPOST_REDUIT = 0.1;

    public int calcularAreaRectangle(int area, int base) {
        return area*base;
    }

    public boolean comprovarSiEsParell(int numero) {
        return numero % 2 == 0;
    }
    
    public double calcularPreuFinal(double preuProducte, int impost, double descompte) {
        double preuTotalImpostos = afegirImpostos(preuProducte, impost);
        return aplicarDescompte(preuTotalImpostos, descompte);
    }


    private double afegirImpostos(double preuProducte, int impost) {
        double percentatgeImpost = 0;
        switch (impost) {
            case 1:
                percentatgeImpost = IMPOST_GENERAL;
                break;
            case 2:
                percentatgeImpost = IMPOST_REDUIT;
                break;
        }
        return preuProducte + (preuProducte * percentatgeImpost);
    }

    private double aplicarDescompte(double descompte, double preuProducte) {
        return descompte - (descompte * preuProducte);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Àrea: " + calc.calcularAreaRectangle(5, 10));
        System.out.println("Preu final general: " + calc.calcularPreuFinal(100, 1, 0.1));
        System.out.println("Preu final reduït: " + calc.calcularPreuFinal(100, 2, 0.1));
        System.out.println("És parell? " + calc.comprovarSiEsParell(8));
    }
}
