package org.entdes.refactor;

import java.util.ArrayList;

class Persona {
    private String nom;
    private String cognom;

    public Persona(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    private String getNomComplet() {
        return this.getNom() + " " + this.getCognom();
    }
    
    public static String getNomComplet(Persona persona){
        return persona.getNomComplet();
    }
}

class Grup {

    private ArrayList<Persona> persones = new ArrayList<>();

    public void afegirPersona(Persona persona) {
        persones.add(persona);
    }

    public void eliminarPersona(Persona persona) {
        persones.remove(persona);
    }

    public String llistarPersones() {
        StringBuilder llista = new StringBuilder();
        for (Persona persona : persones) {
            String nomComplet = this.getNomComplet(persona);
            llista.append(nomComplet).append("\n");
        }
        return llista.toString();
    }

    public String getNomComplet(Persona persona){
        return Persona.getNomComplet(persona);
    }
}

public class MoveMethod {

    public static void main(String[] args) {
        Persona persona = new Persona("Marc", "Pérez");
        Persona persona2 = new Persona("Natàlia", "Llambrich");

        Grup grup = new Grup();
        grup.afegirPersona(persona);
        grup.afegirPersona(persona2);
        System.out.println(grup.llistarPersones());
    }
}