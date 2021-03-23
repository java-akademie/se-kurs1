package ch.jmildner.uebungen2.uebung11;

public class LeadDuck extends Duck
{
    @Override
    void swim()
    {
        System.out.println("I can't swim");
    }

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
        System.out.println("I'm a LeadDuck");
    }
}
