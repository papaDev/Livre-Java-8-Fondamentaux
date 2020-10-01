package fr.openclassroom.chapitre3.exemple.personne.lesaccesseurs;

import fr.openclassroom.chapitre3.exemple.personne.lesaccesseurs.Personne;

public class Main {

    public static void main(String[] args) {

        Personne personne = new Personne();
        personne.setNom("Camenbert");
        personne.setPrenom("Albert");
        System.out.println(personne.getNom());
        System.out.println(personne.getPrenom());


    }

}
