package fr.openclassroom.chapitre3.exemple.personne.nombresparametres;

public class Main {

    public static void main(String[] args) {

        Personne personne = new Personne();
        System.out.println("Affichage 1 parametres");
        personne.affichage("bleu");
        System.out.println("\nAffichage 2 parametres");
        personne.affichage("rouge", "jaune");
        System.out.println("\nAffichage 3 parametres");
        personne.affichage("bleu", "rouge", "jaune");
        System.out.println("\nAffichage 4 parametres et plus");
        personne.affichage("bleu", "rouge", "jaune", "orange");

    }

}
