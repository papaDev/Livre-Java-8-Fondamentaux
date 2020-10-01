package fr.openclassroom.chapitre2.exercices.exercices4;

import java.time.Duration;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.util.Scanner;

public class Principale
{
    public static void main(String[] args) {

        int nbEssais=0;
        int nombre;
        int nbSaisi;

        OffsetTime debut;
        OffsetTime fin;
        Duration temps;

        nombre=(int)(Math.random()*1000);
        Scanner sc;
        sc=new Scanner(System.in);

        debut=OffsetTime.now();

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

        fin=OffsetTime.now();
        temps=Duration.between(debut,fin);
        LocalTime duree;
        duree=LocalTime.ofSecondOfDay(temps.getSeconds());

        System.out.println("Bravo vous avez trouve en " + nbEssais +
                " essai(s) et " + duree.getHour()+" heure(s) " +
                duree.getMinute() + " minute(s) " +
                duree.getSecond()+ " seconde(s)");

    }
}
