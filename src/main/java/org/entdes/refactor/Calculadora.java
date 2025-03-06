package org.entdes.refactor;

public class Calculadora {

    public final double  IVA1 = 0.21;
    public final double  IVA2 = 0.1;

    public int calcularAreaRectangle(int altura, int base) {
        return multiplicar(altura, base);
    }

    private int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public boolean esNombreParell(int numero) {
        return comprovarSiEsParell(numero);
    }

    private boolean comprovarSiEsParell(int numero) {
        return numero % 2 == 0;
    }
    
    public double calcularPreuFinal(double preu, int opcio, double descompte) {
        double preuFinal = afegirImpostos(preu, opcio);
        return aplicarDescompte(preuFinal, descompte);
    }
 
    private double afegirImpostos(double preu, int opcio) {
        double impost = 0; 
        switch (opcio) {
            case 1:
                impost = IVA1;
                break;  
            case 2:
                impost = IVA2;
                break;
            default:
                break;
        }
        return preu + (preu * impost);
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
