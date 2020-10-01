package fr.openclassroom.chapitre1;

/********* Passage d'arguments � une application Java au moment de l'ex�cution ********/

/* Déclaration de la classe principale de l'application */
public class MaClasse
{
    /* Déclaration de la méthode point d'entrée de l'application*/
    public static void main(String args[])
    {

        /* Affichage des arguments de la ligne de commande */

        for (int i = 0 ; i < args.length; i++)
        {

            System.out.println("Argument " +i + " = " + args[i]) ;

        }

        /* Conversion de deux arguments de la ligne de commande de String vers int, puis addition des valeurs enti�res, et affichage du r�sultat */

        int somme;
        somme=(Integer.parseInt(args[3]))+(Integer.parseInt(args[4]));
        System.out.println("Argument 3 + Argument 4 = " + somme);
    }
}
