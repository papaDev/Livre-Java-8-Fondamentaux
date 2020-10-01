package fr.openclassroom.chapitre3.exemple.personne.surchagee;

public class Main {

    public static void main(String[] args) {

        Personne personne = new Personne();
        System.out.println("Affichage à true");
        personne.affichage(true);
        System.out.println("\nAffichage à false");
        personne.affichage(false);

    }

}
