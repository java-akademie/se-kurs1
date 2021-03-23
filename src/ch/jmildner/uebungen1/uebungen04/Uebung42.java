package ch.jmildner.uebungen1.uebungen04;

import ch.jmildner.tools.MyTools;

public class Uebung42
{
    public static void main(String[] args)
    {
        int radius = MyTools.getInteger("radius > ");

        while (radius > 0)
        {
            double umfang = 2 * radius * Math.PI;
            double flaeche = radius * radius * Math.PI;

            System.out.printf("radius: %d; umfang: %f, flaeche: %f %n",
                    radius, umfang, flaeche);

            radius = MyTools.getInteger("radius > ");
        }
    }
}
