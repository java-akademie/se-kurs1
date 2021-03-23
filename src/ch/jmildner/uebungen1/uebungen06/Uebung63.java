package ch.jmildner.uebungen1.uebungen06;

import ch.jmildner.tools.MyTools;

public class Uebung63
{
    public static void main(String[] args)
    {
        MyTools.h1("ggt");
        doIt(9, 12);
        doIt(8, 12);
        doIt(13, 20);
        doIt(21, 28);
    }

    public static void doIt(int a, int b)
    {
        int erg = ggt(a, b);
        System.out.printf("ggt(%d,%d) = %d %n", a, b, erg);
    }

    private static int ggt(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b)
        {
            if (a < b)
            {
                int z = a;
                a = b;
                b = z;
            }
            a -= b;
        }

        return a;
    }
}
