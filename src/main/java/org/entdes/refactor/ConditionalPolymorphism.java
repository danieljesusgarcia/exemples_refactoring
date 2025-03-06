package org.entdes.refactor;

abstract class Personatge {
    protected String nom;
    
    public Personatge(String nom) {
        this.nom = nom;
    }

    public abstract void atacar();
}

class Tirador extends Personatge{
    public Tirador(String nom){
        super(nom);
    }

    public void Atacar(){
        System.out.println(nom + " dispara amb una arma de foc!");
    }
}

class Arquer extends Personatge{
    public Arquer(String nom){
        super(nom);
    }

    public void Atacar(){
        System.out.println(nom + " llença una fletxa!");
    }
}

class Lluitador extends Personatge{
    public Lluitador(String nom){
        super(nom);
    }

    public void Atacar(){
        System.out.println(nom + " dona un cop de puny!");
    }
}


public class ConditionalPolymorphism {

    public static void main(String[] args) {
        Personatge tirador = new Tirador("John");
        //Personatge arquer = new Personatge("Robin", "Arquer");
        //Personatge lluitador = new Personatge("Bruce", "Lluitador");

        tirador.atacar();
        //arquer.atacar();
        //lluitador.atacar();
    }
}