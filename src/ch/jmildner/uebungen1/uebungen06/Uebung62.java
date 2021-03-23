package ch.jmildner.uebungen1.uebungen06;

import ch.jmildner.tools.MyTools;

public class Uebung62
{
    public static void main(String[] args)
    {
        MyTools.h1("div", 2);
        doIt(-57, 7);
        doIt(55, -8);
        doIt(-34, -2);
        doIt(12, 3);
        doIt(1, 20_000_000_000L);
        doIt(0, 20_000_000_000L);

    }

    public static void doIt(long a, long b)
    {
        long erg = div(a, b);
        System.out.printf("%d / %d = %d %n", a, b, erg);
    }

    private static long div(long a, long b)
    {
        int vz = 0;

        if (a < 0)
        {
            vz++;
            a = 0 - a;
        }
        if (b < 0)
        {
            vz++;
            b = 0 - b;
        }

        long erg = 0;

        while (a >= b)
        {
            erg++;
            a -= b;
        }

        if (vz == 1)
            return 0 - erg;
        else
            return erg;
    }
}
