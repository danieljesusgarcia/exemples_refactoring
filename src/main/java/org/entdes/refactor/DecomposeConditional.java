package org.entdes.refactor;

import java.time.LocalDate;
import java.util.Random;

class Usuari {
    private String nom;
    private boolean esAdmin;
    private boolean haPagatSubscripcio;
    private boolean esActiu;
    private LocalDate dataUltimaConnexio;
    private String ipUltimaConnexio;

    public Usuari(String nom, boolean esAdmin, boolean haPagatSubscripcio, boolean esActiu) {
        this.nom = nom;
        this.esAdmin = esAdmin;
        this.haPagatSubscripcio = haPagatSubscripcio;
        this.esActiu = esActiu;
    }

    public void actualitzarUsuari() {
        if (esAdmin || (haPagatSubscripcio && esActiu)) {
            this.dataUltimaConnexio = LocalDate.now();
            this.ipUltimaConnexio = randomIp();
        } else {
            System.out.println("L'usuari " + this.nom + " no té accés.");
        }
    }

    private String randomIp() {
        Random random = new Random();
        return random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256) + "." + random.nextInt(256);
    }

    @Override
    public String toString() {
        return "Usuari [nom=" + nom + ", esAdmin=" + esAdmin + ", haPagatSubscripcio=" + haPagatSubscripcio
                + ", esActiu=" + esActiu + ", dataUltimaConnexio=" + dataUltimaConnexio + ", ipUltimaConnexio="
                + ipUltimaConnexio + "]";
    }

    public static void main(String[] args) {
        Usuari usuari1 = new Usuari("Lucy", true, false, true);
        Usuari usuari2 = new Usuari("in the sky", false, true, true);
        Usuari usuari3 = new Usuari("With diamonds", false, true, false);

        usuari1.actualitzarUsuari();
        usuari2.actualitzarUsuari();
        usuari3.actualitzarUsuari();

        System.out.println(usuari1);
        System.out.println(usuari2);
        System.out.println(usuari3);
    }
}