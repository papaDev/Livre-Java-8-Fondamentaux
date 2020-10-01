package fr.openclassroom.chapitre3.exemple.personne.surchageeillegale;

import java.util.GregorianCalendar;

/************** deuxième fonction affichage surchargée illégale **************/

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

    public void affichage(boolean majuscule) {
        if (majuscule) {
            System.out.println("nom : " + nom.toUpperCase());
            System.out.println("prenom : " + prenom.toUpperCase());
            System.out.println("age : " + calculAge());
        } else {
            System.out.println("nom : " + nom.toLowerCase());
            System.out.println("prenom : " + prenom.toLowerCase());
            System.out.println("age : " + calculAge());
        }

    }

}

