package fr.openclassroom.chapitre3.exemple.personne.champsetmethstatiques;

import java.util.GregorianCalendar;

/************** champs et m�thodes statiques  **************/

import java.util.GregorianCalendar;
public class Personne {

    private String nom = "nouveauNom";
    private String prenom = "nouveauPrenom";
    private GregorianCalendar date_nais = new GregorianCalendar(1900,01,01);
    private int numero = 0;
    private static int numInstance;

    public Personne() {
        nom = "";
        prenom = "";
        date_nais = null;
        numInstance++;
        numero = numInstance;
    }

    public Personne(String n, String p, GregorianCalendar d) {
        nom = n;
        prenom = p;
        date_nais = d;
        numInstance++;
        numero = numInstance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        nom = n.toUpperCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String p) {
        prenom = p.toLowerCase();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.print("\u2020");
        super.finalize();
    }

    public int getNumero() {
        return numero;
    }

    public static int getNbInstances() {
        return numInstance;
    }

}


