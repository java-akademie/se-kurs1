package ch.jmildner.uebungen2.uebung12;

import ch.jmildner.tools.MyTools;

public class TestBrueller
{
    public static void main(String[] args)
    {
        Brueller dog = new Dog();
        Brueller cat = new Cat();
        Brueller mouse = new Mouse();

        MyTools.h1("Animals make noise");

        makeNoise(dog);
        makeNoise(cat);
        makeNoise(mouse);
    }

    private static void makeNoise(Brueller b)
    {
        b.bruellen();
    }
}
