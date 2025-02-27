package org.entdes.refactor;

class Personatge {
    protected String nom;
        private String tipus;
    
    public Personatge(String nom, String tipus) {
        this.nom = nom;
        this.tipus = tipus;
    }

    public void atacar() {
        switch (tipus) {
            case "Tirador":
                System.out.println(nom + " dispara amb una arma de foc!");
                break;
            case "Arquer":
                System.out.println(nom + " llença una fletxa!");
                break;
            case "Lluitador":
                System.out.println(nom + " dona un cop de puny!");
            default:
                break;
        }
    }
}


public class ConditionalPolymorphism {

    public static void main(String[] args) {
        Personatge tirador = new Personatge("John", "Tirador");
        Personatge arquer = new Personatge("Robin", "Arquer");
        Personatge lluitador = new Personatge("Bruce", "Lluitador");

        tirador.atacar();
        arquer.atacar();
        lluitador.atacar();
    }
}