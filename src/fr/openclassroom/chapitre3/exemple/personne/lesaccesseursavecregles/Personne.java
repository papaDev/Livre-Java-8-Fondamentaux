package fr.openclassroom.chapitre3.exemple.personne.lesaccesseursavecregles;

import java.util.GregorianCalendar;

/************* les accesseurs avec r�gles de gestion ************/

public class Personne {

    private String nom;
    private String prenom;
    private GregorianCalendar date_nais;
    // champ privé représentant le numéro de la Personne
    private int numero;
    // champ statique privé représentant le compteur de Personnes
    private static int nbInstances;

    public Personne()
    {
        nom = "";
        prenom = "";
        date_nais = null;
        //  création d'une nouvelle Personne donc incrémentation du compteur
        nbInstances++;
        // affectation à la nouvelle Personne de son num�ro
        numero = nbInstances;
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

    // méthode d'instance permettant d'obtenir le numéro d'une Personne
    public int getNumero() {
        return numero;
    }

    // methode statique permettant d'obtenir le nombre d'instances créés
    public static int getNbInstances() {
        return nbInstances;
    }

}


