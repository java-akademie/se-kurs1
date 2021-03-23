package ch.jmildner.uebungen1.uebungen05;

import ch.jmildner.tools.MyTools;

public class Uebung51
{
    public static void main(String[] args)
    {
        int a = MyTools.getInteger("zahl1 > ");
        int b = MyTools.getInteger("zahl2 > ");
        int op = MyTools.getInteger("op (1=add,2=sub,3=times,4=div,0=end) > ");

        if (op == 1) add(a, b);
        else
            if (op == 2) sub(a, b);
            else
                if (op == 3) times(a, b);
                else
                    if (op == 4) div(a, b);
    }

    private static void add(int a, int b)
    {
        System.out.printf("%d + %d = %d %n", a, b, (a + b));
    }

    private static void sub(int a, int b)
    {
        System.out.printf("%d - %d = %d %n", a, b, (a - b));
    }

    private static void times(int a, int b)
    {
        System.out.printf("%d * %d = %d %n", a, b, (a * b));
    }

    private static void div(int a, int b)
    {
        System.out.printf("%d / %d = %d %n", a, b, (a / b));
    }
}
