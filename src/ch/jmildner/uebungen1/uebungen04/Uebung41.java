package ch.jmildner.uebungen1.uebungen04;

import ch.jmildner.tools.MyTools;

public class Uebung41
{
    public static void main(String[] args)
    {
        int radius = MyTools.getInteger("radius > ");
        double umfang = 2 * radius * Math.PI;
        double flaeche = radius * radius * Math.PI;

        System.out.printf("radius: %d; umfang: %f, flaeche: %f %n",
                radius, umfang, flaeche);
    }
}
