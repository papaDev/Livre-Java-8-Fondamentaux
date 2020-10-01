package fr.openclassroom.chapitre2.exercices.exercices1;

public class Principale
{
    static String[] adresses;
    static String[] listeFournisseurs;
    static String[] nomsFournisseurs;
    static int[] nbClient;
    static int position;
    static String fournisseur;

    public static void main(String[] args)
    {
        adresses=new String[10];
        adresses[0]="jpp@sfr.fr";
        adresses[1]="tom@gmail.com";
        adresses[2]="fred@sfr.fr";
        adresses[3]="victor@sfr.fr";
        adresses[4]="chris@sfr.fr";
        adresses[5]="robert@orange.fr";
        adresses[6]="paul@sfr.fr";
        adresses[7]="lise@gmail.com";
        adresses[8]="thierry@eni.fr";
        adresses[9]="marie@eni.fr";

        listeFournisseurs =new String[10];
        nomsFournisseurs=new String[10];
        nbClient=new int[10];

        for (int i=0;i<adresses.length;i++)
        {
            listeFournisseurs[i]=adresses[i].substring(adresses[i].indexOf('@')+1);
        }

        for(int i=0;i<listeFournisseurs.length;i++)
        {
            int resultat;
            resultat=rechercheFournisseur(listeFournisseurs[i]);

            if(resultat==-1)
            {
                nomsFournisseurs[position]=listeFournisseurs[i];
                nbClient[position]++;
                position++;
            }
            else
            {
                nbClient[resultat]++;
            }

        }

        for(int i=0;i<position;i++)
        {
            System.out.println(nomsFournisseurs[i] + " : " + (double)nbClient[i]/listeFournisseurs.length*100 + "%");
        }

    }

    static int rechercheFournisseur(String nom)
    {
        for(int i=0;i<nomsFournisseurs.length;i++)
        {
            if(nomsFournisseurs[i]!=null && nomsFournisseurs[i].equals(nom))
            {
                return i;
            }
        }
        return -1;
    }

}