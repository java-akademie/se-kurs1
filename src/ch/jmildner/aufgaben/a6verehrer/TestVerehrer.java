package ch.jmildner.aufgaben.a6verehrer;


import ch.jmildner.tools.MyTools;

public class TestVerehrer
{
    public static void main(String[] args)
    {
        MyTools.h1("Test Verehrer");
        Dame d = new Dame();
        Herr h = new Herr();

        d.addVerehrer(h);
        d.doIt();
    }
}
