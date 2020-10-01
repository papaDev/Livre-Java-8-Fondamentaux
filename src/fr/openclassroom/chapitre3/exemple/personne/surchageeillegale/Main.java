package fr.openclassroom.chapitre3.exemple.personne.surchageeillegale;

public class Main {

    public static void main(String[] args) {

        Personne personne = new Personne();
        System.out.println("Affichage majuscule à true");
        personne.affichage(true);
        System.out.println("\nAffichage majuscule à false");
        personne.affichage(false);

    }

}
