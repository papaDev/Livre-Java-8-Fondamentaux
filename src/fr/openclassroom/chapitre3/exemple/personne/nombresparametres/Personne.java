package fr.openclassroom.chapitre3.exemple.personne.nombresparametres;

import java.util.GregorianCalendar;

/*********** fonction avec un nombre quelconque de paramètres **************/

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

    public void affichage(String...couleurs) {
        if (couleurs==null) {
            System.out.println("pas de couleur");
            return;
        }

        switch (couleurs.length) {
            case 1:
                System.out.println("une couleur");
                break;
            case 2:
                System.out.println("deux couleurs");
                break;
            case 3:
                System.out.println("trois couleurs");
                break;
            default :
                System.out.println("plus de trois couleurs");
        }

    }

}

