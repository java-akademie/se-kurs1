package ch.jmildner.aufgaben.a7nachrichten;

public interface NachrichtenQuelle
{
    void addAbo(NachrichtenEmpfaenger e);

    void newNachricht(String nachricht);
}
