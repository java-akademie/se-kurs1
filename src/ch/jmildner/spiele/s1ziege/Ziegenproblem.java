package ch.jmildner.spiele.s1ziege;


public class Ziegenproblem
{
    public static void main(String[] args)
    {
        int ANZ_SPIELE = 10_000_000;
        int anzahlGewonnenOhneVertauschen = 0;
        int anzahlGewonnenMitVertauschen = 0;

        // die 3 Tueren mal ANZ_SPIELE
        int[][] t = new int[3][ANZ_SPIELE];

        // initialisieren der 3 Tueren
        for (int i = 0; i < ANZ_SPIELE; i++)
        {
            int gewinn = (int) (Math.random() * 3);
            t[gewinn][i] = 1;
        }

        // spielen
        for (int i = 0; i < ANZ_SPIELE; i++)
        {
            int tipp = (int) (Math.random() * 3);

            // Auswertung ohne vertauschen
            if (t[tipp][i] == 1)
            {
                anzahlGewonnenOhneVertauschen++;
            }

            // Auswertung mit vertauschen
            if (t[0][i] == 0 && tipp != 0)
            {
                if (tipp == 1)
                    tipp = 2;
                else
                    tipp = 1;
            }
            else
                if (t[1][i] == 0 && tipp != 1)
                {
                    if (tipp == 0)
                        tipp = 2;
                    else
                        tipp = 0;
                }
                else
                    if (t[2][i] == 0 && tipp != 2)
                    {
                        if (tipp == 0)
                            tipp = 1;
                        else
                            tipp = 0;
                    }

            if (t[tipp][i] == 1)
                anzahlGewonnenMitVertauschen++;
        }

        // Ergebnisse ausgeben
        System.out.printf("Ohne Vertauschen: %,11d %n", anzahlGewonnenOhneVertauschen);
        System.out.printf("Mit  Vertauschen: %,11d %n", anzahlGewonnenMitVertauschen);
        System.out.printf("Gesamt          : %,11d %n", anzahlGewonnenMitVertauschen + anzahlGewonnenOhneVertauschen);
    }
}
