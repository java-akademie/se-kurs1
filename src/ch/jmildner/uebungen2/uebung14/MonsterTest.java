package ch.jmildner.uebungen2.uebung14;

import ch.jmildner.tools.MyTools;
import ch.jmildner.uebungen2.uebung12a.Brueller;

public class MonsterTest
{
    public static void main(String[] args)
    {
        testWithInnerClass();
        testWithAnonymousInnerClass();
        testWithLambda();
    }

    /*
     * makeNoise needs a Brueller (the interface from Uebung12.Brueller)
     */
    private static void makeNoise(Brueller brueller)
    {
        brueller.bruellen();
    }


    private static void testWithInnerClass()
    {
        MyTools.h2("Test with Inner Class");

        class Monster implements Brueller
        {
            @Override
            public void bruellen()
            {
                System.out.println("I'm the Monster from the inner Class");
                System.out.println("uuuuuaaaaaahhhhhhhhhhhhhhh");
            }
        }

        Monster monster = new Monster();

        makeNoise(monster);
    }

    private static void testWithAnonymousInnerClass()
    {
        MyTools.h2("Test with anonymous inner class");

        Brueller monster = new Brueller()
        {
            @Override
            public void bruellen()
            {
                System.out.println("I'm the Monster from the anonymous inner Class");
                System.out.println("uuuuuaaaaaahhhhhhhhhhhhhhh");
            }
        };

        makeNoise(monster);
    }

    private static void testWithLambda()
    {
        MyTools.h2("Test with Lambda");

        Brueller monster = () ->
        {
            System.out.println("I'm the Monster from the Lambda");
            System.out.println("uuuuuaaaaaahhhhhhhhhhhhhhh");
        };

        makeNoise(monster);
    }
}
