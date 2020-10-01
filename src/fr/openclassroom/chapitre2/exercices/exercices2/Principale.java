package fr.openclassroom.chapitre2.exercices.exercices2;

public class Principale
{
    public static void main(String[] args)
    {
        int compteur=0;
        int nb1,nb2,nb3;

        do {

            nb1=(int)(Math.random()*1000);
            nb2=(int)(Math.random()*1000);
            nb3=(int)(Math.random()*1000);
            compteur++;
            System.out.println("nombre 1:" + nb1 + " nombre 2:" + nb2 + " nombre 3:" + nb3);

        } while(nb1 % 2==1 || nb2 % 2==1 || nb3 % 2==0);

        System.out.println("Résultat obtenu en " + compteur + " essai(s)");

    }
}
