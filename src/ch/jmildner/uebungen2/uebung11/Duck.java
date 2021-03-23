package ch.jmildner.uebungen2.uebung11;

public abstract class Duck
{
    void swim()
    {
        System.out.println("I'm swimming");
    }

    void quack()
    {
        System.out.println("quack");
    }

    void quack(int times)
    {
        for (int i = 1; i <= times; i++)
        {
            quack();
        }
    }

    void fly()
    {
        System.out.println("I'm flying");
    }

    abstract void show();
}
