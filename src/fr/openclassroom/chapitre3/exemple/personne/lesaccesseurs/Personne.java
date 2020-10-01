package fr.openclassroom.chapitre3.exemple.personne.lesaccesseurs;

import java.util.GregorianCalendar;

/************** les accesseurs  ***************/

public class Personne {

    private String nom;
    private String prenom;
    private GregorianCalendar date_nais;

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
}

