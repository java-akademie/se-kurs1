package ch.jmildner.uebungen2.uebung15;

public class RechnerTest
{
    interface Rechner
    {
        double rechne(double a, double b);
    }

    public static void main(String[] args)
    {
        Rechner adder = (a, b) ->
        {
            return a + b;
        };

        Rechner subtractor = (a, b) ->
        {
            return a - b;
        };

        Rechner multiplier = (a, b) -> a * b;
        Rechner divider = (a, b) -> a / b;

        System.out.println(adder.rechne(5, 7));
        System.out.println(subtractor.rechne(5, 7));
        System.out.println(multiplier.rechne(5, 7));
        System.out.println(divider.rechne(5, 7));
    }
}
