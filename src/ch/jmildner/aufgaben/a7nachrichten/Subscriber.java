package ch.jmildner.aufgaben.a7nachrichten;

public class Subscriber implements NachrichtenEmpfaenger
{
    private final String name;

    public Subscriber(String name)
    {
        this.name = name;
    }

    @Override
    public void empfangeNachricht(String nachricht)
    {
        System.out.println("Nachricht an " + name + " : " + nachricht);
    }
}
