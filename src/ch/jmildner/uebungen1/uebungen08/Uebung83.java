package ch.jmildner.uebungen1.uebungen08;

public class Uebung83
{
    public static void main(String[] args)
    {
        int[][] ar = {
                {1, 2, 3},
                {22, 44, 32, 49},
                {14, 12}
        };

        for (int[] i : ar)
        {
            for (int j : i)
            {
                System.out.println(j);
            }

            System.out.println("----");
        }
    }


}
