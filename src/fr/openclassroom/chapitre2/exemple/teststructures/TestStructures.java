package fr.openclassroom.chapitre2.exemple.teststructures;

/********* structure de boucle ********/

import java.io.IOException;

public class TestStructures
{
    static boolean stop;

    public static void main(String[] args)
    {
        new Thread()
        {
            public void run()
            {
                int c;
                try
                {
                    c=System.in.read();
                    stop=true;
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }.start();

        long compteur=0;

        while(true)
        {
            compteur++;
            if (compteur%2==0)
                continue;
            if (stop)
                break;
            System.out.println(compteur);
        }
        
    }
}
