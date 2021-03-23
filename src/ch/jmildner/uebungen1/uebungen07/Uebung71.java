package ch.jmildner.uebungen1.uebungen07;

import ch.jmildner.tools.MyTools;

public class Uebung71
{
    public static void main(String[] args)
    {
        String s1 = MyTools.getString("name1 > ");
        String s2 = MyTools.getString("name2 > ");

        if (s1.equals(s2))
            System.out.println(s1);
        else
            if (s1.compareTo(s2) < 0)
            {
                System.out.println(s1);
                System.out.println(s2);
            }
            else
            {
                System.out.println(s2);
                System.out.println(s1);
            }
    }
}
