package ch.jmildner.aufgaben.a7nachrichten;


class TestNachrichten
{
    static NachrichtenEmpfaenger s1, s2, s3;
    static NachrichtenQuelle p1, p2, p3;

    public static void main(String[] args)
    {
        // Empfaenger
        s1 = new Subscriber("hugo meier    ");
        s2 = new Subscriber("max huber     ");
        s3 = new Subscriber("moritz miller ");

        // Quelle
        p1 = new Publisher("times      ");
        p2 = new Publisher("new post   ");
        p3 = new Publisher("daily news ");

        // add abo to publisher
        p1.addAbo(s1);
        p2.addAbo(s1);
        p1.addAbo(s2);
        p3.addAbo(s2);
        p1.addAbo(s3);
        p2.addAbo(s3);
        p3.addAbo(s3);

        // a few news

        p1.newNachricht("11.09.2002 mord          ");
        p1.newNachricht("12.09.2002 kidnapping   ");
        p2.newNachricht("11.09.2002 robbery      ");
        p2.newNachricht("12.09.2002 thunderstorm ");
        p3.newNachricht("11.09.2002 earthquake   ");
        p3.newNachricht("12.09.2002 flooding     ");
    }
}
