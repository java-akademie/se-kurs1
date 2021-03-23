package ch.jmildner.uebungen1.uebungen08;

import ch.jmildner.tools.MyTools;

public class Uebung82
{
    public static void main(String[] args)
    {
        int[] mw = new int[10];
        mw[0] = 212;
        mw[1] = 102;
        mw[2] = 99;
        mw[3] = 45;
        mw[4] = 12;
        mw[5] = 78;
        mw[6] = 3;
        mw[7] = 1045;
        mw[8] = 513;
        mw[9] = 172;

        MyTools.h2("before sort");
        for (int i : mw)
        {
            System.out.println(i);
        }

        for (int i = 0; i < mw.length - 1; i++)
        {
            for (int j = i + 1; j < mw.length; j++)
            {
                if (mw[i] > mw[j])
                {
                    int z = mw[i];
                    mw[i] = mw[j];
                    mw[j] = z;
                }
            }
        }

        MyTools.h2("after sort");
        for (int i : mw)
        {
            System.out.println(i);
        }
    }
}
