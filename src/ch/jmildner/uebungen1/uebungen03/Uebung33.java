package ch.jmildner.uebungen1.uebungen03;

import ch.jmildner.tools.MyTools;

public class Uebung33
{
    public static void main(String[] args)
    {
        int start = MyTools.getInteger("start > ");
        int stop = MyTools.getInteger("stop  > ");
        int teiler = MyTools.getInteger("teiler> ");
        for (int i = start; i <= stop; i++)
        {
            if (i % teiler == 0)
                System.out.println(i);
        }
    }
}
