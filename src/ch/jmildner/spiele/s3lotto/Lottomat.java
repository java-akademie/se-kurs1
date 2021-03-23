package ch.jmildner.spiele.s3lotto;

import ch.jmildner.tools.MyTools;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Lottomat
{
    static final int MAX_NUMBERS = 6;
    static final int MAX_RANGE = 70;
    static final int SHOW_RANG = 5;
    static final boolean DEBUG = false;
    static final boolean RANDOM_GUESS = true;

    public static void main(String[] args)
    {
        String format = "Lotto %d/%d " +
                "(MAX_RANGE should be 49=DE, 45=AT, 42=CH or 70=MegaMillions)";

        MyTools.h1(String.format(format, MAX_NUMBERS, MAX_RANGE));

        System.out.println();

        int[] tipp;

        if (RANDOM_GUESS)
        {
            tipp = getZiehung();
        }
        else
        {
            tipp = getTipp();
        }

        System.out.printf("guessed numbers [%s] %n", zeige(tipp));

        MyTools.pause("Press Enter to Start");

        int ziehungen = 0;
        while (true)
        {
            ziehungen++;
            int[] ziehung = getZiehung();

            int rang = getRang(tipp, ziehung);

            if (rang >= SHOW_RANG)
            {
                System.out.printf(
                        "%,11d. ziehung - rang %d - Gewinnzahlen [%s] %n",
                        ziehungen, rang, zeige(ziehung));
            }

            if (rang == 6)
                break;
        }
    }


    private static String zeige(int[] ia)
    {
        StringBuilder z = new StringBuilder();

        for (int j : ia)
        {
            z.append(String.format(" %2d ", j + 1));
        }


        return z.toString();
    }


    private static int getRang(int[] tipp, int[] ziehung)
    {
        int[] gesZiehung = new int[MAX_RANGE];
        int[] gesTipp = new int[MAX_RANGE];

        for (int i = 0; i < MAX_NUMBERS; i++)
        {
            gesZiehung[ziehung[i]]++;
            gesTipp[tipp[i]]++;
        }

        int rang = 0;

        for (int i = 0; i < MAX_RANGE; i++)
        {
            if (gesTipp[i] + gesZiehung[i] == 2)
            {
                rang++;
            }
        }
        if (DEBUG)
        {
            System.out.println(Arrays.toString(gesZiehung));
            System.out.println(Arrays.toString(gesTipp));
            MyTools.pause();
        }
        return rang;
    }

    private static int[] getTipp()
    {
        int[] tipp = new int[MAX_NUMBERS];

        for (int i = 0; i < MAX_NUMBERS; i++)
        {
            tipp[i] = -1;
        }

        for (int i = 0; i < MAX_NUMBERS; i++)
        {
            while (true)
            {
                int zahl = MyTools.getInteger("enter your number " + (i + 1) + " > ",
                        1, MAX_RANGE) - 1;

                boolean zahlVorhanden = false;

                for (int j = 0; j < MAX_NUMBERS; j++)
                {
                    if (tipp[j] == zahl)
                    {
                        zahlVorhanden = true;
                        System.out
                                .println("doppelte sind nicht erlaubt");
                        break;
                    }
                }

                if (!zahlVorhanden)
                {
                    tipp[i] = zahl;
                    break;
                }
            }
        }

        return tipp;
    }

    private static int[] getZiehung()
    {
        Set<Integer> set = new TreeSet<>();

        while (set.size() < MAX_NUMBERS)
        {
            set.add(MyTools.getRandom(1, MAX_RANGE) - 1);
        }

        int[] ziehung = new int[MAX_NUMBERS];
        int index = 0;
        for (Integer i : set)
            ziehung[index++] = i;

        return ziehung;
    }

}
