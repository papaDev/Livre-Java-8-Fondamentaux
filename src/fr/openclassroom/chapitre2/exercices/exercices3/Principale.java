package fr.openclassroom.chapitre2.exercices.exercices3;

import java.util.Scanner;

public class Principale
{
    public static void main(String[] args) {

        int nbEssais=0;
        int nombre;
        int nbSaisi;

        nombre=(int)(Math.random()*1000);

        Scanner sc;
        sc=new Scanner(System.in);

        do {
            nbSaisi=sc.nextInt();
            nbEssais++;

            if(nbSaisi<nombre) {
                System.out.println("c'est plus");
            }

            if(nbSaisi>nombre) {
                System.out.println("c'est moins");
            }

        } while (nombre!=nbSaisi);

        System.out.println("Bravo vous avez trouve en " + nbEssais + " essai(s)");

    }
}
