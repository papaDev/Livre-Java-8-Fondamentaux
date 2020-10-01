package fr.openclassroom.chapitre3.exemple.personne;

import java.util.GregorianCalendar;

/********* Classe Personne avec attributs et méthodes ********/

public class Personne {

    private String nom;
    private String prenom;
    private GregorianCalendar date_nais;

    public long calculAge() {
        long age;
        date_nais = new GregorianCalendar(1963,11,29);
        age = new GregorianCalendar().getTimeInMillis() - date_nais.getTimeInMillis();
        age= age /1000 /60 /60 /24 /365;
        return age;
    }

    public void affichage() {
        System.out.println("nom : " + nom);
        System.out.println("prenom : " + prenom);
        System.out.println("age : " + calculAge());
    }

}

