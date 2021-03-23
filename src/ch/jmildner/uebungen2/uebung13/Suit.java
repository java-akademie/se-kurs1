package ch.jmildner.uebungen2.uebung13;

public enum Suit
{
    KARO(true), KREUZ(false), PIK(false), HERZ(true);

    private final boolean red; // KARO,HERZ=true, PIK,KREUZ=false

    Suit(boolean red)
    {
        this.red = red;
    }

    public boolean isRed()
    {
        return red;
    }

    public String toString()
    {
        return name() + ":" + (isRed() ? "red" : "black ");
    }
}
