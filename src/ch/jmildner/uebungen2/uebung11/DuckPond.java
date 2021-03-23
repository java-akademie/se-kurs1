package ch.jmildner.uebungen2.uebung11;

import ch.jmildner.tools.MyTools;

public class DuckPond
{
    public static void main(String[] args)
    {
        MyTools.h1("TestEnte");
        Duck redHeadDuck = new RedheadDuck();
        Duck wildDuck = new WildDuck();
        Duck leadDuck = new LeadDuck();
        Duck woodenDuck = new WoodenDuck();

        life(redHeadDuck);
        life(wildDuck);
        life(leadDuck);
        life(woodenDuck);
    }

    private static void life(Duck d)
    {
        d.show();
        d.swim();
        d.fly();
        d.quack();
        d.quack(2);
        System.out.println();
    }
}
