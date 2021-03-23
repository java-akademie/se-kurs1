package ch.jmildner.uebungen2.uebung11;

public class WoodenDuck extends Duck
{
    @Override
    void quack()
    {
        System.out.println("I can't quack");
    }

    @Override
    void fly()
    {
        System.out.println("I can't fly");
    }

    @Override
    void show()
    {
        System.out.println("I'm a WoodenDuck");
    }
}
