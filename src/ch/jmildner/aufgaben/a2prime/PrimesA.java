package ch.jmildner.aufgaben.a2prime;

import ch.jmildner.tools.MyTools;

public class PrimesA
{
    public static void main(String[] args)
    {
        MyTools.h1("Primes");

        final int MIN = 1999000000;
        final int MAX = 2000000000;
        int z1 = 0;

        for (int x = MIN; x < MAX; x++)
        {
            if (Prime.isPrim(x))
            {
                // System.out.println(x + "  ");
                z1++;
            }
        }

        System.out.printf("between %d and %d there are %d Primes. %n",
                MIN, MAX, z1);
    }

}
