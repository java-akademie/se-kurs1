package ch.jmildner.aufgaben.a2prime;

public class Prime
{
    public static boolean isPrim(int x)
    {
        if (x < 2)
        {
            return false;
        }
        if (x == 2)
        {
            return true;
        }

        int grenze = 1 + (int) Math.pow(x, 0.5);

        for (int i = 2; i < grenze; i++)
        {
            if (x % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
