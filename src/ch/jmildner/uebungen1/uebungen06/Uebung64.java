package ch.jmildner.uebungen1.uebungen06;

import ch.jmildner.tools.MyTools;

public class Uebung64
{
    public static void main(String[] args)
    {
        MyTools.h1("kgv");
        doIt(9, 12);
        doIt(8, 12);
        doIt(13, 20);
        doIt(21, 28);
    }

    public static void doIt(int a, int b)
    {
        int erg = kgv(a, b);
        System.out.printf("kgv(%d,%d) = %d %n", a, b, erg);
    }

    private static int kgv(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a < b)
        {
            int z = a;
            a = b;
            b = z;
        }

        int m = a;

        while (a % b != 0)
        {
            a += m;
        }

        return a;
    }
}
