package ch.jmildner.uebungen1.uebungen01;

import ch.jmildner.tools.MyTools;

public class Uebung1
{
    public static void main(String[] args)
    {
        System.out.println("Uebung1 ...");

        int z1 = MyTools.getInteger("insert number1  > ");
        int z2 = MyTools.getInteger("insert number2 > ");

        System.out.println(z1);
        System.out.println(z2);


        int summe = z1 + z2;
        int differenz = z1 - z2;
        int produkt = z1 * z2;
        int quotient = z1 / z2;

        System.out.println("summe     : " + summe);
        System.out.println("differenz : " + differenz);
        System.out.println("produkt   : " + produkt);
        System.out.println("quotient  : " + quotient);
    }
}
