package ch.jmildner.spiele.s2mastermind;

import ch.jmildner.tools.MyTools;

import java.util.Arrays;

public class Mastermind
{
    static boolean debug = false;
    static int MAX = 30;

    public static void main(String[] args)
    {
        MyTools.h1("START MASTERMIND");

        String message = "";

        int[] aufgabe = getAufgabe();

        if (debug)
            System.out.println(Arrays.toString(aufgabe));

        for (int i = 1; i <= MAX; i++)
        {
            int[] tipp = getTipp();

            String ergebnis = getErgebnis(aufgabe, tipp);

            System.out.println("                   " + ergebnis);

            if (ergebnis.equals("*****"))
            {
                message = "You won";
                break;
            }
        }

        System.out.println(message);

        System.out.println(Arrays.toString(aufgabe));

        MyTools.h1("END MASTERMIND");
    }


    private static String getErgebnis(int[] aufgabe, int[] tipp)
    {
        if (Arrays.equals(aufgabe, tipp))
        {
            return "*****";
        }

        int trefferPosition = 0;

        for (int i = 0; i < 5; i++)
        {
            if (aufgabe[i] == tipp[i])
            {
                trefferPosition++;
            }
        }

        StringBuilder ergebnis = new StringBuilder();

        ergebnis.append("*".repeat(Math.max(0, trefferPosition)));

        int trefferInsgesamt = 0;

        int[] gesAufgabe = new int[10];
        int[] gesTipp = new int[10];

        for (int i = 0; i < 5; i++)
        {
            gesAufgabe[aufgabe[i]]++;
            gesTipp[tipp[i]]++;
        }

        for (int i = 0; i < 10; i++)
        {
            trefferInsgesamt += Math.min(gesAufgabe[i], gesTipp[i]);
        }

        trefferInsgesamt -= trefferPosition;

        ergebnis.append("0".repeat(Math.max(0, trefferInsgesamt)));

        return ergebnis.toString();
    }


    private static int[] getTipp()
    {
        int[] tipp = new int[5];

        while (true)
        {
            String t = MyTools.getString("enter your guess > ");

            int zaehler = 0;

            for (int i = 0; i < t.length(); i++)
            {
                char ch = t.charAt(i);

                if (i < 5)
                    tipp[i] = ch - '0';

                if (Character.isDigit(ch))
                    zaehler++;
            }

            if (t.length() == 5 && zaehler == 5)
            {
                break;
            }

            System.out.println("wrong input ");
        }

        return tipp;
    }


    private static int[] getAufgabe()
    {
        int[] aufgabe = new int[5];

        for (int i = 0; i < 5; i++)
        {
            aufgabe[i] = (int) (Math.random() * 10);
        }
        return aufgabe;
    }

}
