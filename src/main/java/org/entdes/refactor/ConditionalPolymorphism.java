package org.entdes.refactor;

class Personatge {
    protected String nom;
        private String tipus;
    
        public Personatge(String nom, String tipus) {
            this.nom = nom;
            this.tipus = tipus;
    }

    public void atacar() {
        if(tipus.equals("Tirador")) {
            System.out.println(nom + " dispara amb una arma de foc!");
        } else if(tipus.equals("Arquer")) {
            System.out.println(nom + " llença una fletxa!");
        } else if(tipus.equals("Lluitador")) {
            System.out.println(nom + " dona un cop de puny!");
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