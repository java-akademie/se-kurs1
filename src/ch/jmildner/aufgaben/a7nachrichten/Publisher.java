package ch.jmildner.aufgaben.a7nachrichten;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements NachrichtenQuelle
{
    private final String name;
    private final List<NachrichtenEmpfaenger> receivers = new ArrayList<>();

    public Publisher(String name)
    {
        this.name = name;
    }

    @Override
    public void addAbo(NachrichtenEmpfaenger e)
    {
        receivers.add(e);
    }

    @Override
    public void newNachricht(String nachricht)
    {
        for (NachrichtenEmpfaenger e : receivers)
        {
            e.empfangeNachricht(name + " " + nachricht);
        }
    }
}
