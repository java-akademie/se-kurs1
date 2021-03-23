package ch.jmildner.aufgaben.a6verehrer;

import ch.jmildner.tools.MyTools;

public class Dame
{
    Verehrer verehrer;

    void addVerehrer(Verehrer v)
    {
        verehrer = v;
    }

    void doIt()
    {
        int z = 0;
        while (++z <= 10)
        {
            MyTools.sleep(MyTools.getRandom(1000, 9999));
            verehrer.anruf();
        }
    }
}
