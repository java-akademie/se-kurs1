package ch.jmildner.aufgaben.a2prime;

import ch.jmildner.tools.MyTools;

public class PrimesB
{
    public static void main(String[] args)
    {
        MyTools.h1("Couples of Primes");

        final int MIN = 1_000_000_000;
        final int MAX = MIN + 1_000_000;

        int z1 = 0, z2 = 0;

        int lastPrim = -1;

        for (int x = MIN; x < MAX; x++)
        {
            if (Prime.isPrim(x))
            {
                if (lastPrim + 2 == x)
                {
                    z1++;

                    System.out.printf("%,d/%,d \t",
                            lastPrim, x);

                    if (z1 % 4 == 0)
                        System.out.println();
                }

                z2++;

                lastPrim = x;
            }
        }

        System.out.println();
        System.out.println();
        System.out.printf("between %,d and %,d there are %,d primes and %,d couples of primes.\n",
                MIN, MAX, z2, z1);
    }
}


